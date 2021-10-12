# PCToaster
Another malware which written in Java, basically it's uses cmd extension commands for example `attrib`, `diskpart` etc. If you want to make something most annoyning in Java, it's best **nerd guy(s)** example.

# Commands uses
These are commands which used by this `attrib`, `diskpart`, `takeown`, `icacls`, `del` (Based on MS-DOS / Command Prompt), `mountvol`. To overwrite a disk area, imagine writing a new file on a disk (it not require admin priviledge except C and protected drive). For info at `worker.java`

# Found this shit from
https://www.youtube.com/watch?v=rQom5E_aIvE

# Packages and conclusion
They are internal worker or simply they are calling like a function when user need them. Decompilation level beginner, it's easy to decompile it. Just extract classes from binary and seperate packages and classes.


