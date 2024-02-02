# @Configuration :
- It's mean that SecurityConfig class `provides configuration` to Spring application context.

# @EnableWebSecurity :
- When annotating a configuration class with it . It tells spring boot to `automatically apply Spring Security's default` web security configuration .
- **Such as :**
    - `Security Filters` - Chain of filters. [SecurityFilterChain](#SecurityFilterChain-).
    - `Request Authorization`.
    - `Authentication Providers:` Setting up authentication mechanisms such as form-based login, HTTP Basic authentication, OAuth 2.0
  
    


# SecurityFilterChain :
- In order to enforce security constraints , we use the `interface SecurityFilterChain` that represent a `chain of filters` .
- Those filters are used to process incoming requests and outgoing responses .
- Each filter is responsible for a specific aspect of security, such as authentication , authorisation and CSRF protection ... 

# HttpSecurity :
- Is a `configuration object` provided by spring security .
- We use it to `configure web-based security` for web application .

# authorizeHttpRequests :
- It is a method that is used to `configure authorisation rules for HTTP requests`.
- It allows us to specify which requests should be `permitted or denied access` based on `various criteria` such as user roles , authentication status , request paths ...

# oauth2Client :
- It is a method that is used to `enable OAuth2.0` client support.
- It is typically used with `OAuth2.0 providers` such as Google , Facebook , GitHub ... to enable authentication and access to the application.

___

# `Web-based security` 
- Refers to the range of techniques , protocols and best practices to protect web application , users and data from various security threats and vulnerabilities.
# `Spring application context`
- It's a core concept within the Spring framework .
- It represents the container where all beans **(components)** of a spring application are managed ,wired and configured.
- Also , it provides the necessary infrastructure to instantiate , configure and assemble objects **(beans)**.