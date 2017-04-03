# dover 

MS Windows only. There will be a similar process for linux and mac, but these are not directly supported.
Requires Java Version 8.
Ensure java bin directory is in the path variable

Build the jar by doubleclicking buildjar.bat
(or run buildjar.bat in the command line)
Depending on available memory, run the jar from the command line:
``java -jar -Xmx14g dover.jar``
The ``-Xmx14g`` sets the java heap to 14 GB and is based on running the program with a machine that has 16GB RAM total. Modify this for your particular configuration
The interface window should then appear.

Data is available [online](https://www.cs.kent.ac.uk/projects/dover/).

Full instructions, including on installation and usage, are available on the [wiki](https://github.com/peterrodgers/dover/wiki).

