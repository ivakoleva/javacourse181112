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
* port the code to use Gender enum instead of any string value

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
           
        
 