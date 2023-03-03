MODULE?=""

.PHONY: test
test:
	mvn test

.PHONY: test_module
test_module:
	mvn test -pl ${MODULE}

.PHONY: create_module
create_module:
	cp -r template_solution ${MODULE}
	cd ${MODULE}
	echo ${PWD}
	mv ${MODULE}/src/main/java/com/stefano/boriero/solution ${MODULE}/src/main/java/com/stefano/boriero/${MODULE}
	mv ${MODULE}/src/test/java/com/stefano/boriero/solution ${MODULE}/src/test/java/com/stefano/boriero/${MODULE}
	find ${MODULE} -type f -exec sed -i "s/problem_name/${MODULE}/g" {} \;
	sed -i "s:</modules>:    <module>${MODULE}</module>\n    </modules>:" pom.xml
	mvn package
