# WeeklyCodingChallenge

Java Reactive:
Submit the answers to the below questions:
1) What does Asynchrony mean in the context of Reactive Systems?
    - it simply is refering to the sections of that is independent of the flow of the main program. The goal is to stop bottlenecking the main thread.

2) What is Elasticity in contrast to Scalability?
    - Elasticity refers to being able to "mold or stretch" our resources to what we actually need. While scalability comes in two flavlors. Vertical and horizontal scaling, vertical means that we add resources too our single machine to make up for resources needed. While horizontal scaling is adding more rescources(pc/servers) to reach what is needed. 

3) Define the Actor Model?
    - There is an Actor(similar to object in OOP or a single unit of code), has the following operations; create actor, send a message, or decide how to handle next message. Actor has its private state that needs a message in order to update, they do not take up memory. Actors process the data in FIFO order and work asychronously and thus do not need to wait on each other. There is a heichary of actors, sort of like strucuture of employment where this a top level supervisor and then a few superviosr below them and finally the actors, they can decide if they need to resart the actors, delete them or start new ones. 

4) Mention a few similarities between Redux and RxJS.
    - Redux is a state management tool for dealing with state on the web application and Rxjs is a reactive library for dealing with asnchy code and callbacks.

Create a function that takes a number as an argument and returns true if the number is a valid credit card number, false otherwise.

Credit card numbers must be between 14-19 digits in length, and pass the Luhn test, described below:

- Remove the last digit (this is the "check digit").
- Reverse the number.
- Double the value of each digit in odd-numbered positions. If the doubled value has more than 1 digit, add the digits together (e.g. 8 x 2 = 16 ➞ 1 + 6 = 7).
- Add all digits.
- Subtract the last digit of the sum (from step 4) from 10. The result should be equal to the check digit from step 1.
Examples
validateCard(1234567890123456) --> false

 - Step 1: check digit = 6, num = 123456789012345
 - Step 2: num reversed = 543210987654321
 - Step 3: digit array after selective doubling: [1, 4, 6, 2, 2, 0, 9, 8, 5, 6, 1, 4, 6, 2, 2]
 - Step 4: sum = 58
 - Step 5: 10 - 8 = 2 (not equal to 6) --> false