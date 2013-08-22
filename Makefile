all:
	find ./src | grep '\.java$$' | xargs javac

test: all
	cd src && java Test

clean:
	find ./src | grep '\.class$$' | xargs rm -f