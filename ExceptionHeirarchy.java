/*
 *             object
 *                |
 *            Throwable
              ____|____
              |       |
          Error       Exception  
         ___|___      ____|____________________________
         |  |  |      |             |                  |
Threaddeath | I/O    RunTime       SQL Exception    I/O Exception
            |        Exception             *CheckedException*
Virtual Machine        |
         Error       1.Arithematic
            |        2.Array
       Out of Memory  3.NullPointer
                     *UncheckedException*
                   
 
 
 
 */               
