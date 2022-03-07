package VirtualKey;




import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class Lockers02 {

public static void main(String[] args) throws IOException

{
	System.out.println("");
	System.out.println("Application Name: Virtual Key for Your Repositories");
	System.out.println("Developer: Ganesh");
	System.out.println("");
	
	Scanner inputnumber1 = new Scanner(System.in);

	String mainMenu = ("Kindly select the appropriate number as mentioned below to continue \n"+
	"1 : View current files list in the folder\n"+
	"2 : File modifications in the folder \n" +
	"3 : Close the application \n");
	
	
	

		System.out.println(mainMenu);
		int menuChoice =inputnumber1.nextInt();


		while (menuChoice < 1 || menuChoice > 3) {
	        System.out.print("\nError! Incorrect choice.\n");
	        System.out.println("");
	        System.out.println(mainMenu);
	        menuChoice = inputnumber1.nextInt();
            }
		
		while (menuChoice==1) {

			// try-catch block to handle exceptions
			
				  
		        // try-catch block to handle exceptions
		        try {
		        	Scanner scanner01 = new Scanner( System.in );
		            System.out.println("Enter the file path: ");
		            String dirPath = scanner01.nextLine(); // Takes the directory path as the user input

		            File folder = new File(dirPath);
		            // Create a file object
		          
		  
		            // Get all the names of the files present
		            // in the given directory
		            File[] files = folder.listFiles();
		  
		            System.out.println("Files are:");
		  
		            // Display the names of the files
		            for (int i = 0; i < files.length; i++) {
		                System.out.println(files[i].getName());
		                
		            }
		            System.out.println("");
		            System.out.println(mainMenu);
	    	        menuChoice = inputnumber1.nextInt();
		        }
		        catch (Exception e) {
		            System.err.println(e.getMessage());
		        }
		    }
			
			
		while(menuChoice==2) {
			
			

            String subMenu01=("\n"+"1: Create a new file by creating new file directory \n"+
			"2: Create a new file in the existing file directory \n" +
            "3: Delete a file from existing file directory \n"+	
			"4: Search a specified file from the directory \n"+
			"5: Go back to previous menu" );
            
            System.out.println(subMenu01);
            Scanner inputnumber2 = new Scanner(System.in);
			int submenuChoice01=inputnumber2.nextInt();
			
			while (submenuChoice01 < 1 || submenuChoice01 > 5) {
		        System.out.print("\nError! Incorrect choice.\n");
		        System.out.println("");
		        System.out.println(subMenu01);
		        submenuChoice01 = inputnumber2.nextInt();
		    }
			
			while (submenuChoice01 == 1) {
				
				System.out.println("Enter the path to create a directory(like C/D/E): ");
			      Scanner sc = new Scanner(System.in);
			      String path = sc.nextLine();
			      System.out.println("Enter the name of the desired folder: ");
			      path = path+":"+File.separator+sc.nextLine();
			      //Creating a File object
			      File file = new File(path);
			      //Creating the directory
			      boolean bool = file.mkdir();
			      if(bool){
			         System.out.println("Folder created successfully");
			      }
			      else{
			         System.out.println("Sorry couldn’t create specified folder directory");
			      break;
			      }
				String input;
			      do {System.out.println("Enter the file name: ");
			      Scanner sc01 = new Scanner(System.in);
			      String fileName = sc.nextLine();
			      System.out.println("Enter the type of file (Ex: txt /xlsx/docx/jpg) : ");
			      Scanner sc02 = new Scanner(System.in);
			      String fileType = sc.nextLine();
			      String fileName01=fileName+"."+fileType;
			     File file01 = new File(path+File.separator+fileName01);
			     
			     
			 
			 	boolean isFileCreated = file01.createNewFile();
			 	
			 	if(isFileCreated) {
			 		
			 		System.out.println("File is created");
			 	}
			 	else if(file01.exists()) {
			 		System.out.println("File already exists");
			 	}
			   
			    else{
			            System.out.println("Sorry couldn’t create specified file " );
			 
			        }
			      System.out.println("Do you want to create one more file? Yes or No ");
			      Scanner sc03 = new Scanner(System.in);
			       input = sc.nextLine();
			      
			            
			      
			      }
			      while(input.equalsIgnoreCase("Yes"));
			      
			      do {
			    	  System.out.println("");
				        System.out.println(subMenu01);
				        submenuChoice01 = inputnumber2.nextInt(); 
			    	  break;
			    	  
			      }
				while(input.equalsIgnoreCase("No"));
				
			}
			
			while (submenuChoice01 == 2) {
				
				System.out.println("Enter the directory path: ");
			      Scanner sc03 = new Scanner(System.in);
			      String path02 = sc03.nextLine();
			     
				String input01;
			      do {System.out.println("Enter the file name: ");
			      Scanner sc04 = new Scanner(System.in);
			      String fileName02 = sc04.nextLine();
			      System.out.println("Enter the type of file (Ex: txt /xlsx) : ");
			      Scanner sc05 = new Scanner(System.in);
			      String fileType02 = sc05.nextLine();
			      String fileName03=fileName02+"."+fileType02;
			     File file02 = new File(path02+File.separator+fileName03);
			     
			     
			 
			 	boolean isFileCreated = file02.createNewFile();
			 	
			 	if(isFileCreated) {
			 		
			 		System.out.println("File is created");
			 	}
			 	else if(file02.exists()) {
			 		System.out.println("File already exists");
			 	}
			   
			    else{
			            System.out.println("Sorry couldn’t create specified file " );
			        }
			      System.out.println("Do you want to create one more file? Yes or No ");
			      Scanner sc06 = new Scanner(System.in);
			       input01 = sc06.nextLine();
			      
			            
			      
			      }
			      while(input01.equalsIgnoreCase("Yes"));
			      do {
			    	  System.out.println("");
				        System.out.println(subMenu01);
				        submenuChoice01 = inputnumber2.nextInt(); 
				        break;
			    	  
			      }
				while(input01.equalsIgnoreCase("No"));
				
			      }
			while (submenuChoice01==3) {
				
				System.out.println("Enter the directory path: ");
				Scanner sc07 = new Scanner(System.in);
			      String path03 = sc07.nextLine();
				
			      String input03;
			      do {System.out.println("Enter the complete file name (Ex: filename.filetype): ");
			      Scanner sc08 = new Scanner(System.in);
			      String fileName04 = sc08.nextLine();
			      
			    
			     File file03 = new File(path03+File.separator+fileName04);
			     
			     
			 
			 	boolean isFileDeleted = file03.delete();
			 	
			 	if(isFileDeleted) {
			 		
			 		System.out.println("File is deleted");
			 	}
			 	else {
			 		System.out.println("Sorry! File could not found");
			 	}
			   
			  
			      System.out.println("Do you want to delete one more file? Yes or No ");
			      Scanner sc09 = new Scanner(System.in);
			       input03 = sc09.nextLine();
			      
			            
			      
			      }
			      while(input03.equalsIgnoreCase("Yes"));
			      do {
			    	  System.out.println("");
				        System.out.println(subMenu01);
				        submenuChoice01 = inputnumber2.nextInt(); 
				        break;
			    	  
			      }
				while(input03.equalsIgnoreCase("No"));
				
			      }
			
			
		 	    while (submenuChoice01==4) {
		 	    	
		 	  
		 	   		// try-catch block to handle exceptions
		 	   		try {
		 
		 	   			Scanner scanner = new Scanner( System.in );
		 	               System.out.println("Enter the file folder path: ");
		 	               String dirPath = scanner.nextLine();
		 	   			// Create a file object
		 	   			File f = new File(dirPath);
		 		   		String input04;
		 	   			do{Scanner scanner02 = new Scanner( System.in );
		 	   			System.out.println("Enter the file name: ");
		 	               String fileName = scanner02.nextLine();

		 	   			// Create a FilenameFilter
		 	   			FilenameFilter filter = new FilenameFilter() {

		 	   				public boolean accept(File f, String name)
		 	   				{
		 	   					return name.startsWith(fileName);
		 	   				}
		 	   			};

		 	   			// Get all the names of the files present
		 	   			// in the given directory
		 	   			// and whose names start with "12"
		 	   			File[] files = f.listFiles(filter);

		 	   			
		 	   			
		 	   			if(files == null) {
		 	   				
		 	   			System.out.println("File does not exist in the directory!");
		 	   			}
		 	   			else {

		 	   			// Display the names of the files
		 	   			for (int i = 0; i < files.length; i++) {
		 	   			System.out.println("Files are:");
		 	   				System.out.println(files[i].getName());
		 	   						 	   			 
		 	   			}}
		 	   		System.out.println("Do you want to search one more file? Yes or No ");
				      Scanner sc09 = new Scanner(System.in);
				       input04 = sc09.nextLine();}
		 	   			while(input04.equalsIgnoreCase("Yes"));
		 	   			
		 	   			do {
		 	   			
		 	   		System.out.println("");
		            System.out.println(subMenu01);
	    	        submenuChoice01 = inputnumber2.nextInt();
	    	        break;
		 	   		}
		 	   			
		 	   		while(input04.equalsIgnoreCase("No"));
		 	   		
		 	   		
		 	   		}
		 	   		catch (Exception e) {
		 	   			System.err.println(e.getMessage());
		 	   			
		 	   		}
		 	   	
		 	    	
		 	    	
		 	    	
		 	    	
		 	    	
		 	    }
				
				while(submenuChoice01==5) {
					
					
					 System.out.println("");
			            System.out.println(mainMenu);
		    	        menuChoice = inputnumber1.nextInt();
		    	        break;
			}
			
				
			
			
			
}
		
	if (menuChoice==3) {
			
			System.out.println("Application closed. Thank You.");
		}
		
		
		
}
}