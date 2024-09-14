-----------------------------------------
"# Java_NoGUI" 
USING EDIT PLUS AND j2sdk1.4.2_19
IN SDK CAN USE IN LATEST VERSION , MY CODE USE version 1.4.2_19
Install EDIT PLUS
Install j2sdk1.4.2_19
-----------------------------------------
SET UP IN EDITPLUS
Tools > Preferences > User Tools
-----------------------------------------
MAKE COMPILE PROGRAM
Add Tool >> Program
Menu text: Compile
Command : PATH TO YOUR javac.exe exemple "C:\j2sdk1.4.2_19\bin\javac.exe"
Argument : $(FileName)
Initial directory :$(FileDir)
-----------------------------------------
MAKE RUN PROGRAM
Add Tool >> Program
Menu text: Run
Command : PATH TO YOUR java.exe exemple "C:\j2sdk1.4.2_19\bin\java.exe"
Argument : $(FileNameNoExt)
Initial directory :$(FileDir)
-----------------------------------------
