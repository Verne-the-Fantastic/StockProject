clean:
	find ./ -type f -name "*.class" -delete

run:
	make clean
	javac src.App.java
	java src.App
