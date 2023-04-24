## CS-305 Software Security - Lance Cain

* CS-305 Project Two

# Reflection

The provided profile that serves as our client for this class is “Artemis Financial” and the client profile covers a number of details about the financial firm and their needs.  Our tasks included determining a proper algorithm for data verification for file downloads as well as industry standard certificates for secure communication using https, though the certificate is valid for other forms of encrypted communication that can use a signed certificate.  While we created the certificates using a self-signing method, this was due to the offline nature of the project and is meant to simulate the process of acquiring a signed key and using it in a Spring Framework Java Web API.

Using a dependency check tool finding vulnerabilities was fairly easy, especially since the codebase is years out of date and java has more bugs than an exotic pet store.  While the majority of the bugs found were simply a matter of updating the codebase to current to remedy the situation, that is not always the case.  These vulnerabilities would not only make their company far less desirable to clients, but would also allow for threat actors to potentially access private information.

What I find challenging is that the method provided to check dependencies for vulnerabilities was only provided for java, and while java is a commonly used language, having other languages such as C# covered, would have felt more relevant, at least for my future goals.  By adding certificates for secure and encrypted communications, as well as hashing algorithms and functions to ensure data integrity on downloads, providing secure data transactions with clients is now far easier and secure.

There are a number of ways to check security of code from using dependency checks to manually testing the code to verify that the expected outputs hold true to the function of the code.  Often done with unit testing.  Rerunning tests and dependency checks are necessary after refactoring code to ensure that the functionality was not ultimately changed in unexpected ways.

Since I primarily work with C languages and have no intention of diving deeply into java or using it as a primary language, the skills only translate in patterns of thought relevant to security minded software development.  Though most of those concepts I have toyed with in previous jobs due to working in I.T.
I intend to have my authentication api done by middle of 2023, this will likely server as my example of my backend work with asp.net core, mysql, unit tests, authentication, and authorization using both pre-existing tools as well as newly created systems when necessary.  I have included Project two per the requirements of the portfolio assignment though.
