# Login-Servlet
This a Servlet Dispatcher Mini Project

### RequestDispatcher:-
- The RequestDispatcher is a Java Servlet API interface used to forward requests to other resources on the server (like another servlet, JSP, or HTML) or to include the content of another resource in the current response.
- It is obtained using the getRequestDispatcher() method of a ServletRequest object and offers two primary methods: forward() for redirecting the request to a different resource, and include() for adding the output of another resource to the current response.

### Methods Used:
##### forward(ServletRequest request, ServletResponse response): 
Forwards a request and response from the current servlet to another resource on the server.
##### include(ServletRequest request, ServletResponse response):
Includes the response of another resource (like a JSP or HTML) into the response being sent to the client.

---
## Mini-Project Description:
Our project aims to open a login form with Username and Password with login button.

When we login,WelcomeServlet should be accessed giving a message "Login Successful" when user enter correct credentials 

else

error form should be display giving access to login again.

<img width="480" height="186" alt="image" src="https://github.com/user-attachments/assets/a7a67a39-b33f-40b7-93a9-9a22ae46893e" />

## How to run:

```bash
 Run login.html




