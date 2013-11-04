default:
	scalac ints.scala
	javac -cp /usr/local/Cellar/scala/2.10.3/libexec/lib/scala-library.jar:. TestIntOrInteger.java
	# ~/Downloads/jad158g.mac.intel/jad IntOrInteger.class
