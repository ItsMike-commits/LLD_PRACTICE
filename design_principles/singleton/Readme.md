
1. What is the Singleton Design Pattern and why is it used?
-- The Singleton Design Pattern ensures that only one instance of a class is created throughout the    entire application.
-- This is particularly useful for managing shared resources such as database connections, configuration managers, or logging systems.
-- By restricting the instantiation of a class to a single object, the Singleton pattern helps maintain consistency, reduces resource usage, and simplifies application management.
-- Creating multiple instances of such resources can lead to inefficiency, increased complexity, and potential errors, so the Singleton pattern provides a centralized and controlled way to access these resources.

2. Looking at your code, what problem does making the constructor private solve in the Singleton pattern?
-- By making the constructor private, you prevent external classes (clients) from directly creating instances of the class.
-- This restriction ensures that the only way to obtain an instance is through the designated method (usually getInstance()), which controls and limits the instantiation to a single object.
-- Without a private constructor, multiple objects could be created, violating the Singleton pattern and defeating its purpose of having a single, shared instance across the application.



3. How does your getInstance() method ensure only one instance is created in a single-threaded environment?
-- Null check on object helps us to return omly one instance.
-- If obj == null, new object is created else same created object is returned ensuring only one object.


4. Can you explain what issue arises when multiple threads access the getInstance() method simultaneously?
-- If multi-threading is not handled safely, multiple instances of the obj will be created violating singleton design principle.


5. In your code, you used double-checked locking. Can you explain how double-checked locking works and why it is needed?
-- Double-checked locking is a technique used to reduce the overhead of acquiring a lock by first checking the condition without synchronization. 
-- In the singleton pattern, it works by first checking if the instance is null outside the synchronized block. If it is, the code enters a synchronized block and checks again if the instance is still null before creating it. 

-- This ensures that only one instance is created, even in a multi-threaded environment, while minimizing synchronization costs. Double-checked locking is needed to make the singleton both thread-safe and efficient, preventing multiple threads from creating separate instances and avoiding unnecessary locking after the instance is initialized.


6. Is your current implementation of double-checked locking thread-safe? Are there any potential pitfalls?
--The double-checked locking approach can make the singleton thread-safe if implemented correctly. --However, in Java, there is a potential pitfall related to the visibility of the obj variable. If obj is not declared as volatile, threads may see a partially constructed object due to instruction reordering and caching. 
-- To ensure thread safety, obj should be declared as private static volatile SingletonClass obj;. Without volatile, the implementation may still allow multiple instances or return an incompletely constructed object in a multi-threaded environment.


7. What would happen if you remove the synchronized block from your double-checked locking implementation?
-- Possibly, multiple instances of obj will be created .

8. Can you mention other ways to implement a thread-safe singleton in Java?
-- Eager Loading, Synchronized getInstance method.

9. Why might you choose eager initialization over lazy initialization for a singleton?
-- Eager initialization creates the singleton instance at the time of class loading, rather than when it is first needed.
-- You might choose eager initialization when the singleton object is lightweight and will definitely be used during the application's lifetime.
-- It is simpler to implement and inherently thread-safe, as the instance is created before any threads access it. This avoids synchronization overhead and potential thread-safety issues associated with lazy initialization. However, it may lead to unnecessary resource usage if the instance is never actually used.

10. How would you test that your singleton implementation is truly thread-safe?
-- Create multiple thraeds -> Call getInstance method from each thread -> Verify all prints the same address.