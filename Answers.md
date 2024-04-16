#Questions and Answers from 1 to 6

##Question 1
 
 Explain the difference between a stack and a queue. Provide real life examples of
 real-life scenarios where each of them are used appropriately.

 The stack and the queue are linear data structures,but they follow different principles.A stack follows the LIFO(Last int first Out) principle,which means that the element inserted at the last is the first element to come out.So,the elements can be inserted and deleted only from one side of the list,called the top.
The queue follows the FIFO(First in first Out) principle,which means the element inserted at first in the list, is the first element to be removed from the list.So,the elements can be inserted and deleted only from one side of the list,and the elements can be deleted only from the other side.

Example of a stack: When enjoying a summer day at the beach, a practical example of using a stack arises with the need for a beach chair. Beach chairs are stacked, allowing beachgoers to retrieve one from the top easily. Likewise, when it's time to return the chair, it is placed back on the top of the stack, maintaining order and accessibility for others.

Example of a queue:A practical instance of a queue in real life would be the queue of travelers awaiting their turn at airport security checkpoints for the inspection of their baggage. Each individual queues up in an orderly fashion, adhering to the first-come-first-served principle, as they anticipate their luggage to undergo the necessary security procedures.

##Question 2
 What is the difference between an array and a linked list? Provide advantages and
 dsadvantages of each data structure.

 An array is a coniguous block of memory that stores elements of the same type and has a fixed size.

Advanteges:
-Accessing elements in array it can be done in constant time as it can be done by using the element's index.
-Simple implementation: Arrays have a straightforward implementation and are supported by most programming languages.

Disadvantages: 
Arays have a fixed size, which means they cannot dynamically grow. Resizing arrays can be inneficient terms of time and memory.

Insertion and deletion operations in arrays can be inefficient, especially when performed in the middle or beginning of the array, as it requires shifting elements.

A linked list is a collection of nodes where each node contains a data element and a reference to the next node in the sequence.

-Advantages:
-Linked lists can dynamically grow and shrink in size.
-Insertion and deletion operations in linked lists can be efficient, especially for inserting or deleting elements at the beginning or end of the list.
-Linked lists only use as much memory as needed, as opposed to arrays, which may have unused space if their size exceeds the actual number of elements.

-Disadvantages:
- Accessing elements in a linked list is sequential, which means that accessing elements in the middle or end of the list requires traversing through the entire list.
-Linked lists have additional memory overhead due to the storage of references for each element, compared to arrays which only store the data elements.

##Question 3
What is HTTP? How is it different from HTTPS?

-HTTP(hypertext transfer protocol) is an unsecured protocol used for transmiting data over the internet.
-HTTPS is a secure version of HTTP that encrypts data using SSL/TLS protocols,providing confidentiality.

Differences:HTTP is not secured,which means the data transmitted over HTTP can be interceped and read by anyone in between the sender and the reciever.HTTPS is secured and the data can be read only by the sender and the receiver.

HTTP is used for a wide variety of porposes,including browsing websites and dowloading files.
HTTPS is used for online banking,shopping,email.

##Question 4

Can you give some examples of common HTTP response codes?

-200 OK:The request was successfull and the server has returned the requested resource.
-201 Created: The request has been fulfilled, and a new resource has been created as a result of it. 
-401 Unauthorized: The request requires user authentication. 
-404 Not Found: The server cannot find the requested resource.
-503 Service Unavailable

##Question 5

What is the difference between authorization and authentication?

Authentication verifies the identity of users(validating their credentials) while authorization determines what they are allowed to do once their identity has been verified. Authentication comes first in the process, followed by authorization to control access to resources based on the authenticated user's permissions.

##Question 6

How would you explain to a 5-year-old how the WWW works?

-Imagine the World Wide Web as a giant building of fun where you can find all sorts of cartoonsBut you have to use a special machine called computer to see them from anywhere in the world.

When you want to find something on the web, like an episode from Scooby-Doo or Gmble's world,you use a tool called a web browser, which is like a magic pair of glasses for your computer. You type in the name of what you're looking for, and the web browser helps you find it.Each thing you find has its own special address, just like your home has an address. This address is called a web address or URL. When you type a web address into your web browser, it takes you right to that thing.And there are lots of different sections in the web building of fun.Some sections have cartoons with animals,some with different creatures etc. You can explore different sections of the by clicking on links or buttons in the web pages.