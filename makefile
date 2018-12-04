JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $*.java
	
CLASSES = \
	Move.java \
	Moves.java \
	Gameboard.java \
	PegPuzzle.java
	
default: classes
classes: $(CLASSES:.java=.class)
clean: 
	$(RM) *.class