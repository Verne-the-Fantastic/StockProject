clean:
	find ./ -type f -name "*.class" -delete

run:
	javac Stocks.java
	java Stocks
