install:
	./gradlew install

run-dist:
	./build/install/app/bin/app

check-updates:
	./gradlew dependencyUpdates
