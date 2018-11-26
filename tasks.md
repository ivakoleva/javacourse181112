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
           
        
 