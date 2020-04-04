clean:
	find ./ -type f -name "*.class" -delete

run:
	make clean
	javac Stocks.java
	java Stocks
