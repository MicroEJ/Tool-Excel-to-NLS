# Overview
Internalization is an important part of many projets so that users can select the language they want for their system. MicroEJ offers a library named NLS (National Language Support) to help developers to internationalize the messages in their applications. NLS imposes the structure of the translation files, with a simple and efficient "[key]=[message]" format. Nevertheless, each company may be have their own format for the translation files they share with their translators, often using Microsoft Excel.

Here, we demonstrate how an Excel file (xlsx) can be converted to files that respect the NLS format. We use the Apache POI library to make this transformation. You can adapt this tool to your specific file format.

Two Eclipse projets are provided:
1. Excel-to-NLS converts an Excel file to a set of NLS files and drops the result in the second project.
2. HelloWorld takes all the generated files and uses NLS to display the same message in several languages.

## Project Setup
Excel-to-NLS comes without the JAR files from Apache POI. You have to download them from http://poi.apache.org. You have to copy the following JAR files to the `lib` folder of the project:
- poi-[version].jar
- poi-ooxml-[version].jar
- poi-ooxml-schemas-[version].jar
- xmlbeans-[version].jar
Then, right-click on the project and select Properties. In the left menu, select Java Build Path and open the Libraries tab. Add the above JARs to the Java build path.

HelloWorld is already fully configured.

### Requirements
MicroEJ 3.1.0 or above must be installed on your computer.

### Project structure
- Tool-Excel-to-NLS

 - Excel-to-NLS
  - `excel/`:  folder with a example xlsx file
  - `launches/`: Java launch configuration
  - `lib/`:  folder to place the dependency JAR files  
  - `src/main/java/`: Java sources
  
 - HelloWorld
  - `excel/`:  folder with a example xlsx file
  - `launches/`: MicroEJ launch configuration 
  - `src/main/java/`: Java sources
  - `src/main/resources/`: resources
  
 - `LICENCE.md`
 - `README.md`


## Usage
First, execute the App class of the Excel-to-NLS project. A launch configuration is provided for convenience. This will generate a set of NLS files and drop them in the appropriate folder of the HelloWorld project.

Second, execute the Main class of the HelloWorld project. A launch configuration is provided with the path to the NLS.list properly configured. This will print the same message with all the available locales in the Eclipse console.

## License
See the license file `LICENSE.md` located at the root of this repository.
