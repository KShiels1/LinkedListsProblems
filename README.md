# LinkedListsProblems


CS211 Algorithms and Data Structures 2 (Tuesday lab)

Lab 2 and 3 – Singly-linked lists and generics

Objectives:
• Exercise implementing linked-list methods
• Practice generics and object-oriented concepts
• Reflect on the knowledge learned about Linked lists

Lab 2 introduction: A technician in a hardware shop receives a batch of tasks. Each task has
a name (string) and length (integer), which indicates the required number of minutes to
complete the task. The number of tasks is not known in advance, so the technician creates a
singly-linked list to organize the tasks.

Lab 2, step 1: Implement a Java class called Task to store each task's name and length
attributes. The access modifiers of the attributes must be private, and accessing them should
be done via public methods, e.g., get_length() or set_length(), etc. The
constructor of this class takes two input parameters, name: string and length: integer, to
create a task object.

Lab 2, step 2: Write a main() program that stores the following tasks in a singly linked list
using the given SinglyLinkedList java class in Moodle and the Task class you
implemented in the previous step.
(T1,20), (T2,5), (T3,25), (T4,30), (T5,10), (T6,15)

Lab 2, step 3: Write a Print(SinglyLinkedList S) function that prints the stored
tasks in the linked list. To test your function, print the stored tasks from the previous step.

Lab 2, step 4: Implement a method that returns the second-to-last node in which the last
node is indicated by a null next attribute. You can print the returned node to test your
method using the tasks in step 2. As a second test, create an empty singly linked list and call
the method. Your code should return an exception, which has to be handled in the
main()using try{} catch{}.

Lab 3 introduction: The technician startsto work with the shortest tasksfirst. To create
a sorted singly-linked list based on task length, he stores the first task as a head node.
Then, checks the second task. If it is shorter than the first one, he stores it before the
first one (as a new head). Otherwise, he stores it after the first one. Similarly to store
the third one, he moves (traverses) through the singly linked list and stores it in an
appropriate location.

Lab 3, step 1: Create a new class called MySinglyLinkedList that inherits
(extends) the SinglyLinkedList class, given in Moodle. Implement a method
called Insert_sorted in the new class to store a new element (task) in an
appropriate location, as described in the introduction. Test your program by storing
the following tasks. Printing the linked list using lab 2 step 3.
(T1,20), (T2,5), (T3,25), (T4,30), (T5,10), (T6,15)

Lab 3, step 2: After creating the list of tasks, the technician starts to work and sets the
timer. He writes the time in which a task is completed. For instance, the first task
requires 5 minutes to complete, so the completion time is 5. The second task that
requires 10 minutes, so the completion time is 15 (5+10=15). Write a program that
prints the task names and their completion time.
Sample output:
T2: finished in 5.
T5: finished in 15.
T6: finished in 30.
T1: finished in 50.
…
Lab 3, step 3: Repeat step 1 with a doubly-linked list class given in Moodle.
Don’t forget to answer the quiz before or after the described steps


All source code for this lab was obtained from:

Data Structures and
Algorithms in Java™
Sixth Edition
Michael T. Goodrich

Roberto Tamassia

Michael H. Goldwasser
