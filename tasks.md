29.01:

* Exercise:
    ** Annotation usage exercise - using template class tasks.AnnotationUsageExercise
        *** print to stdout all annotated class members
    

28.01:

* Exercise:
    ** Library Web App - port Library exercise to a Web application, reusing existing code-base
        *** add 2 Filters
            **** populate Library & assign to request
            **** populate Books to library inventory
            **** map filters in a particular order, only before all URLs starting with "person"

24.01:

* Homework:
    ** Review Executors util, interface surface
    ** Library Web App - port Library exercise to a Web application, reusing existing code-base
        *** Create a class (purpose of application memory storage) with static class members:
            **** data lists, getters, setters
            **** initialize them with sample data
        *** Create servlets & JSPs for:
            **** listing summary (HTML table-like)
                ***** library details 
                ***** inventory items
                ***** persons
            **** listing all details of one particular data item per id (id would be in-memory index of data item in list)
            
            **** Bonus: create a JSP, with HTTP form (post method), for adding a new data item   
    
* Exercise:
    ** Build & deploy web app using tomcat maven plugin, in debug mode
        *** stop breakpoint at init, doGet and destroy methods
        *** find out how many instances of HelloWorldServlet, and life cycle 

22.01:

* Homework:
    ** Review Executors util, interface surface
    ** Locate latest Java Servlet specification, Java community process website (jcp.org, Java EE platform)
        *** review specification PDF
    ** Deploy web app using Tomcat manager (web interface)
        *** maven clean & package project
        *** use packaged .war, upload and deploy using web manager
    
18.01:

* Homework: wrap-up exercises 
    
* Exercise:
    ** FixedThreadPoolExecutor exercise
        *** instantiate a fixed thread pool executor of size 3
        *** submit 10 Callable instances, returning an object instance
        *** collect the result of all submitted callables
        *** shut down the executor service
        *** exit the program
        
    ** Proxy exercise 
        *** intercept all setters of String values
        *** then modifwy the value to upper-case
        *** set the modified value
        *** print proxied instance fields to stdout

17.01:

* Homework:
    ** Reflection generic instantiation - Setters
        *** instantiate a class in a generic way
        *** invoke all setters, assigning default values, supporting at least 3 data types

* Exercise:
    ** Reflection generic instantiation - Constructors
        *** create a sample class, with a few overloaded constructors
        *** instantiate that class, by each of the overloaded constructors, using reflection

15.01:

* Homework:
    ** Resetable enumeration exercise - complete tasks.ResetableEnumerationExercise
    ** ProvincesEnum implementation (https://en.wikipedia.org/wiki/Provinces_of_Bulgaria)
        *** 3 enum values
        *** additional meta information per value
            **** label
            **** population
            **** municipalities
            
            **** Bonus: planning region

* Exercise:
    ** Library exercise - Magazine & Newspaper - implement concept of sequential issues - do homework
        *** add issue number to each entity (Integer)
    ** Enumeration-collection bridge exercise
        *** create a collection, transform it to enumeration
        *** transform enumeration to collection
        *** loop over an enumeration, then print to stdout
    ** Library exercise - implement static Utils generic generate method
        *** supporting any extending AbstractItem - Book, Magazine, Newspaper
        *** class supplied as parameter
        *** a new instance returned
   
14.01:

* Homework:
    ** Library exercise - Magazine & Newspaper - implement concept of sequential issues
        *** add issue number to each entity (Integer)
        *** add an interface, design and implement publishing pattern support (each day of week, once a month, etc)
    ** Custom comparator exercise - SubscriptionRenewal null support
        *** test with null Person's SubscriptionRenewal property
        *** patch if needed
        
* Exercise:
    ** Custom comparator exercise
        *** Handle local changes; merge master branch to local one
        *** Instantiate 3 Persons, each pearson with 3 SubscriptionRenewals with unique dateTimeOfPayment
        *** Implement an utility class, that provides static method
            **** accepts collection of Persons
            **** uses custom Comparator<Person>
            **** returns a new list of sorted Persons, based on latest to earliest dateTimeOfPayment 

10.01:

* Homework:
    * Complete Library management software v0.1 domain model
    * Implement Application class with main(), instantiate objects for POC (proof-of-concept)

* Exercise: 
    ** Complete innerexercise homework
    ** Library management software v0.1 
        *** tasks.libraryexercise_v0_1 package; model subpackage
        *** create domain model, purposed for:
            **** library organization itself
                ***** name
                ***** employees
                ***** clients
                ***** items inventory
            **** roles (enum Role)
                ***** clients
                ***** employees
            **** keeping personal records of all people
            **** inventory of
                ***** books
                ***** magazines
                ***** newspapers
            **** each inventory item includes
                ***** ISBN (String)
                ***** name
                ***** unique id (identifier, Long)
            **** keeping history of items rented per person
            **** monthly subscription
                ***** 30 days, starting right away from date of payment
            

08.01:

* Homework:
    ** package task.innerexercise - define and instantiate one instance per each listed bellow; narrow scope of visibility outside outer context (minimum visibility using access modifiers)
        *** Inner class (non-static) 
        *** Static nested
            **** class
            **** interface
            **** enum 
        *** Local class
        *** Anonymous class (using a functional interface)

* Exercise:
    ** CompositionAndInheritanceExercise
        *** implement Human class
        *** apply methods supported from main() method


07.01:

* Homework:
    ** Votes v0.6 - package tasks.votes_v0_6_exercise
        *** Complete data population regarding requirements
        *** Implement PersonService, then refactor current Person instantiation
        *** Elaborate Poll with anonymous setting (true/false) 
        
    ** Bonus: create data model for
        *** AnswerGiven per Poll per Question (Person mapping optional (based on anon instance setting above)) 

* Exercise:
    ** Votes v0.5 - populate data (tasks.Votes05DataPopulationExercise.java):
        *** Poll: Coffee poll
            **** Question1: Do you like coffee?
            **** Answers:
                ***** Yes
                ***** No
            **** Question2: How do you enjoy your coffee?
                ***** Milk
                ***** Sugar
                ***** Milk & sugar
                ***** Black
                ***** None of the above
            **** Question3: How many coffees do you have a day?
                ***** Less or equal of 2
                ***** More than 2 but less than 5
                ***** More or equal of 5
                ***** None
            **** Persons participating: 2
        

03.01:

* Homework:
    ** Votes v0.4 - introduce OOP concepts
        *** subpackage, data model 
        *** entry point class, with main method
        *** etc.

* Exercise:
    * Future age calculator application v0.2
        ** create tasks.calculatorexercise sub-package 
        ** Calculator class implementation
        ** Calculator accepts parameters of:
            ** Person objects (age field)
            ** years to add to age of each person
        ** Program flow:
            ** When starting the program, populate 10 Person objects
            ** Instantiate Calculator
            ** Execute additions, and print to standard output
            ** Then exit
        ** Distribute to end user (push to github)
        
    * Random person names generator
        ** configure charset (symbols allowed)
        ** configure min/max length per word
        ** random generator PizzaPlate implementation should be dedicated to be reused
        ** when producing a name - first letter always upper case, other letters lower case
        ** words joined using a space
        ** sample runner, for POC purposes
        
        ** Bonus: names count

02.01:
    
* Exercise:
    ** find & review java.util.stream.Stream class, Java class library
    ** find in functional package BiFunction - 2 input and 1 output parameters of the same type
    ** implement StandardUtilSampleExercise TODOs:
        *** StandardUtilsSample, capitalizeFirstLettersThenConcat method
        *** LambdaUtilsSample, capitalizeFirstLettersThenConcat function

* Homework:
    ** StaticNonstaticMethodsExercise - use static and non-static methods
        *** create a task unique package (subpackage of com.musala.javacourse181112.tasks, think about naming)
        *** add a Person class (entity)
        *** add a class PersonService, implementing:
            **** static method
                ***** name printPersonNamesToStdout
                ***** use appropriate access modifier (scope of visibility)
                ***** print arguments to stdout, using space discriminator then new line
            **** non-static methods
                ***** addPerson, accepting and storing Person object to queue
                ***** handlePerson, polling one from queue then printing it to stdout (hint: method composition), then returning the person polled
                ***** think of multi-threading, always in mind
        *** add StaticNonstaticMethodsExercise class, and implement main method:
            **** instantiate 10 Person instances (loop) and add to collection
            **** instantiate 2 PersonService objects
            **** call service static and non-static methods, using populated persons
            **** use service static method and print directly a new person instance with assigned properties
            
        *** Bonus: implement non-static finalize method, reseting the PersonService instances state at the end of usage

20.12:

* Exercise:
    ** create a concept of a validatable entity & validator
    ** if non-valid - throw a custom checked ValidationException
    
    ** implement EGN validator
    ** implement custom EGN validation exception
    ** apply validator, using a sample EGN to test

18.12:

* Exercise:
    ** PopulatePersonClassGenericAlgorithmExample - deserialize & populate a generic instance from file
    
* Homework:
    ** PopulatePersonClassGenericAlgorithmExample - add generic serialization
        *** instantiate a Person object, then pass as parameter of a generic method (supporting Entities)
        *** loop over fields
            **** filter non-null values
            **** then write each field name=required1 format to file
                  
        *** Bonus 1: handle case of deserialization when whitespaces only present after =
        *** Bonus 2: add support to parseValueFromString() of additional class types

17.12:

* Exercise:
    * GenericsTriDimensionalMatrixExercise - show-case of multi-dimensional array; define tri-dimensional List of Integers
    * Recursion - populate a n-level dimensional List of int recursively

* Homework:
    * Wildcard bridge
        ** create a List of unknowns
        ** pass argument to bridge method
        ** implement workaround so we could add an object to List
        ** should be able to compile then run, and print to stdout
   
    * Create and populate a generic Set, that supports addition of at least Integer, Long, Short, Double
    
    * Read Java Oracle docs regarding Generics (by email)

13.12:

* Exercise:
    ** Map exercise - populate and traverse over Map:
        *** keys
        *** values
        *** entries
    ** Utils exercise 
        *** populate an ordinal List of 10 integers
        *** shuffle list
        *** sort list
        *** reverse order
        *** populate a second List
        *** add same element 100 times to second List
        *** concatenate both lists, in order to print to stdout
        
* Homework:
    ** Threads, serializing/deserializing data and put/take to queue
        *** first, populate a queue with 10 lists of integers 0-20
        *** create a specific directory on FS (file system), dedicated to store serialized data
        *** then spawn two threads
            **** consumer thread, while not interrupted:
                ***** takes a list from queue
                ***** for each list, serializes to one file 
            **** producer thread, while not interrupted:
                ***** watches the directory for a new file
                ***** reads file, deserializes file data, removes file
                ***** puts to queue
                
        *** Bonus: program parameter - cycles count (per cycle of take-then-put back to queue)
            **** proof could be file naming convention (cycle count number)
            
    ** Read Oracle Java docs regarding Collections

11.12:

* Exercise:
    ** Oracle Java Docs, Language Basics, questions & exercises (control_flow_statements_exercise.md)
    ** Deduplication Exercise
        *** populate a List of values, some of which duplicated
        *** deduplicate (result of unique values only, equals() & hashCode())
            **** 2 implementations - with and without Lambda
    ** BlockingQueue drainTo Exercise
        *** instantiate a blocking queue (LinkedBlockingQueue, ArrayBlockingQueue)
        *** populate with 10 elements
        *** instantiate a collection, then transfer 5 queue elements to that collection
        
* Homework:
    ** PriorityBlockingQueue<Integer> Producer-Consumer Exercise
        *** two producer threads, subclassing class Thread (random int between [1, 100000])
        *** two consumer thread, subclassing class Thread
        *** threads populate and consume, each while(true) with Thread.sleep of 2 seconds
        *** application executes until explicitly stopped

10.12:

* Homework:
    ** Singleton implementation of Application class
    ** spawning two threads, sharing a map instance
        *** Long key - current system millis
        *** String message
        *** when adding entries, do runtime type check of elements explicitly
    ** producer thread populating unlimited values on each 3 seconds
    ** consumer thread
        *** reads 10 map entries
        *** prints them on stdout
        *** interrupts producer thread
    ** main thread exits with 0
    
    ** review all new example implementations   

06.12:

* Homework:
    ** Populate an instance per general-purpose collection implementations 
        *** Set (HashSet, TreeSet, LinkedHashSet)
        *** List (ArrayList, LinkedList)
        *** Queue
        *** Deque (ArrayDeque, LinkedList)
    ** Populate a Map
    ** Loop a collection/map and modify (remove an element/entry while looping)
    ** Apply add/put remove contains size isEmpty etc. 
    
    ** Piped I/O example spawning threads (for reference, PipedInputOutputStreamExample)
        *** writing thread running 5 exact times, then closing the stream
        *** reading thread looping while data available
        
    ** Bonus: implement TriConsumer (for reference, java.util.function.BiConsumer)

03.12:

* Important: tomorrow (04.12.) will do exercises only - remotely

* Homework:
    ** Lambda exercise
        *** implement String to StringBuilder function
        *** implement String predicate - if string is length of 10
    ** File exercise (29.11) - complete if not yet completed
    ** DataObjectStreamExercise (29.11) - complete if not yet completed
    ** Primitives and Wrappers exercise
        *** define and initialize all supported types of primitives and their respective wrappers
        *** loop and print array to stdout
        *** stream the array (Arrays util)
        *** using instanceof, filter by boolean 
        *** collect to list

29.11:

* Recommended for weekend exercises:
    ** PushbackReader exercise
            *** use buffer of 128 length
            *** print to stdout
            *** if last buffer char read is \[a-p\] - unread 3 chars, in order to print them again
        
    ** Bonus: subclass FilterInputStream
        *** count all read operations (each time read() is being called from outside)
        *** add a counter class field
        *** implement getCount() method
        
    ** WatchServiceExample questions ?
    ** FileVisitorWalkTreeExample questions ?
        
* Exercises:
    ** File exercise
        *** creation 
            **** create a file using a non-existing path
            **** show if file exists
            **** create as directory
            **** create two new files into that directory
        *** delete on exit
            **** create a new file
            **** mark for deletion on exit
            **** list parent directory, containing this filename (to prove existence in runtime)
            **** exit program, then check manually if file exists

* Homework:
    ** DataObjectStreamExercise
        *** implement a serializable class Company
        *** write diverse multiple primitives, persons and companies to file
        *** read them back from file
        *** collect them to data structure (array of objects or collection)
        *** loop data structure then print to stdout
    ** Code review of WatchServiceExample
    ** Code review of FileVisitorWalkTreeExample

26.11:

* Important: tomorrow (27.11.) will do exercises only - on-side or remotely
* Please send email to iva.koleva@clearcode.bg (will create a mailing list)
    ** javacourse-181112@clearcode.bg mailing list available

* InputStream exercise v0.2
    ** after reading the file, do store file content to tasks_copy.md (to a new file, using FileOutputStream)
    
* Reader exercise
    ** read characters from tasks.md, using FileReader
    ** write to stdout, optimize (take a look at parameters available for System.out.print(), placing pointer at () then Ctrl+P)
         
* Homework:
    ** Write exercise - using Writer, write/append
        *** read from program parameters
        *** write each parameter to a new line
        *** write to a file
        
    ** FileOutputStream exercise
        *** using FileOutputStream, bridge to Writer then write some content
        *** content encoding - Windows-1251
        *** add buffering (Buffered*)
        
    ** PushbackReader exercise
        *** use buffer of 128 length
        *** print to stdout
        *** if last buffer char read is \[a-p\] - unread 3 chars, in order to print them again
    
    ** Bonus: subclass FilterInputStream
        *** count all read operations (each time read() is being called from outside)
        *** add a counter class field
        *** implement getCount() method

22.11:

* Loops exercise elaboration
    ** add lambda stream.forEach implementation (Arrays.stream)
    ** add looping and modifying a collection of strings (using iterator)
        *** remove if: element length % 2 == 0
        
* InputStream exercise
    ** implement inputStream.read(buffer, offset, length)

20.11:

* Future age calculator v0.2
    ** implement multiple program arguments support (unlimited number)
    ** assume and rely on user input (int values)
    ** sum all of the parameters, then print to stdout (use while or do-while)
        *** bonus: do input validation - natural numbers only; exit(1) if otherwise

* Loops exercise - for each loop type (while; do-while; for; foreach)
    ** automatically (using loop), initialize an array with values
    ** print the array to stdout

* Votes v0.3 application
    * refactor, using loops

19.11:

* Create a Chromosomes application that:
    ** based on human gender, prints chromosomes (male: yx/xy; female: xx)
    ** use switch-based check
    ** parameters supplied by user
    ** prints chromosomes to stdout (letter by letter)
* port the code to use Gender enum instead of any string required1

* Votes v0.2 application
    * introduce enum usage (vote answer yes/no)
    * implement votes counting then printing to stdout
    * introduce person multi-dimensional array (Object), then populate:
        ** first element of each inner person array - EGN
        ** second element - name
        ** third - Vote (enum)

15.11:

* Future age calculator application 
    * Program parameters, supplied by user (dynamic):
        * person age in years 
        * years to add to age
    * Program flow:
        * When starting the program, print the two numbers
        * Then add numbers, and print to standard output
        * Then exit
    * Distribute to end user (push to github)    

* Votes v0.1 application (all data hardcoded)
    * Supports:
        * Yes/No poll
        * 30 voters per question
        * 2 questions

    * Flow - once per each question
        * print welcome message, stating the poll question
        * hardcode 3 person votes (voted yes/no)
        * assign votes to array
        * TODO: design method for future votes counter implementation (method with empty body)
        
    * Hint: multi-dimensional array usage
    * Distribute to end user (push to github)    
    * Sample data:
        * Question 1: Is it snowing today? Yes/No
        * Question 2: Do you want rather to be snowing today? Yes/No
        * 3 votes per each question
           
        
 