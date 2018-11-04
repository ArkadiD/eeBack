task printSource() {
    println "here comes the resources sourceSet"
    sourceSets.main.resources.each { println it }
    print "\n \n"
    println "print fileTree"
    println sourceSets.main.resources.asFileTree.each { println it }
    println ">> fileTree matching"
    println ">>> persistence "
    println sourceSets.main.resources.asFileTree.matching { include("META-INF/**") }.each { println it }
    println ">>> import "
    println sourceSets.main.resources.asFileTree.matching { include("import.sql") }.each { println it }
    println ">> fileTree filter "
    // println sourceSets.main.resources.asFileTree.filter { include("import.sql") }.each { println it }
    print "\n \n"
    println ">> find "
    println sourceSets.main.resources.find { 'persistence.xml' }.toString()
    println sourceSets.main.resources.find { 'import.sql' }.toString()
    print "\n\n"
    println "get filename"
    println sourceSets.main.resources.asFileTree.matching { include("import.sql") }.each { println it.getName() }
    println sourceSets.main.resources.asFileTree.matching { include("META-INF/**") }.each { println it.getName() }
    println "** prefix"
    println sourceSets.main.resources.asFileTree.matching { include("**/**") }.each { println it.getName() }
    println sourceSets.main.resources.asFileTree.matching { include("**/persistence.xml") }.each {
        println it.getName()
    }

    print "\n \n"
    println "getSingleFile import method"
    println sourceSets.main.resources.getFiles().toString()
    println "print include fileset"
    println sourceSets.main.resources.include("import.sql").each { println it }
    println sourceSets.main.resources.exclude("import.sql").each { println it }
    println "star operator"
    println sourceSets.main.resources.asFileTree.matching { include("**/**") }.each { println it }
}