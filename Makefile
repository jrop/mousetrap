all:
	find . | grep '\.java$$' | xargs javac

clean:
	find . | grep '\.class$$' | xargs rm -f