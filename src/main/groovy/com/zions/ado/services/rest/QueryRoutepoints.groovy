
package com.zions.ado.services.rest
/*@Grapes([
	@Grab(group='mysql', module='mysql-connector-java', version='5.1.26'),
	])*/

@GrabConfig(systemClassLoader=true)
import groovy.sql.Sql

def sql = Sql.newInstance("jdbc:mysql://localhost:3306/gps", "root", "root", 
	"com.mysql.jdbc.Driver")

def newTemperature = 100
sql.executeUpdate("update routepoints set temperature = ${newTemperature}")

sql.close()