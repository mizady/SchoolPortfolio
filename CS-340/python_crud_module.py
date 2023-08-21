from pymongo import MongoClient
from bson.objectid import ObjectId

class AnimalShelter(object):
	""" CRUD operations for Animal collection in MongoDB """
	
	def __init__(self, connectionString):
		# Initializing the MongoClient. This helps to
		# access the MongoDB databases and collections.
		# This is hard-wired to use the AAC database, the
		# animals collection, and the aac user.
		# Definitions of the connection string variables are
		# unique to the individual Apporto environment.
		#
		# You must edit the connection variables below to reflect
		# your own instance of MongoDB!
		#
		# Connection Variables
		#
		USER = 'aacuser'
		PASS = 'WaffleMaker1'
		HOST = 'nv-desktop-services.apporto.com'
		PORT = 31669
		DB = 'AAC'
		COL = 'animals'
		#
		# Initialize Connection
		#
		
		self.client = MongoClient(connectionString)
		
		#self.client = MongoClient('mongodb://%s:%s@%s:%d' % (USER,PASS,HOST,PORT))
		self.database = self.client['%s' % (DB)]
		self.collection = self.database['%s' % (COL)]
		
	def create(self, data):
		if data is None:
			raise Exception("Nothing to save, because data parameter is empty")
		
		try:
			self.database.animals.insert_one(data) # data should be dictionary
		except Exception as e:
			print(f"Exception: {e}")
			return False
		
		return True
	
	
	def read(self, query):
		if query is None:
			raise Exception("Nothing to find, because query parameter is empty")
		
		try:
			documents = self.collection.find(query)
			return list(documents)
		except Exception as e:
			print(f"Exception: {e}")
			return []
	
	def update(self, query, updatedValues):
		try:
			self.collection.update_many(query, {"$set": updatedValues})
		except Exception as e:
			print(f"Exception: {e}")
			return False
		
		return True
		
	def delete(self, query):
		try:
			self.collection.delete_many(query)
		except Exception as e:
			print(f"Exception: {e}")
			return False
			
		return True
	
