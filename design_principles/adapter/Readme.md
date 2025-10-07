1. Why did you create separate adapter classes (IciciBankAdapter and SbiBankAdapter) for each  bank instead of using a single generic adapter?
--Every bank has implemented their APIs in their own way and we can't change their way of implementing things. So we have defined our adapter class in which we are adjusting our APIs to accommodate the third-party APIs.

2. How does your adapter class help achieve loose coupling between your application and the third-party bank APIs?
Whenever I need to change the reference of a third-party API, I can simply replace the existing third-party object with the required one and everything works as expected without major code changes.

3. If a new bank with a different API joins your system, what steps would you take to integrate it using the Adapter pattern?
I will create a new Adapter class inside which I will adjust my APIs according to the new bank APIs, and if this needs to be called, I will simply create and use its object.

4. What would happen if the third-party bank API changes its method signature or adds new required parameters? How would you handle such changes in your adapter implementation?
I will have to create and pass those parameters into my interface and adapter class to match all required parameters. There will be modifications in my adapter class to adapt to the new changes the bank has introduced.

5. In your current implementation, how would you handle errors or exceptions thrown by the third-party bank APIs within your adapter classes?
Using try-catch blocks. This allows me to catch exceptions thrown by third-party methods and handle them gracefully, such as logging the error or returning a meaningful response to my application.