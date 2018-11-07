package myRoom;

public class Decorations {
  private String Name;
  private String type;
  private String where;
  private String decorDecription;
  
public Decorations(String name, String type, String where, String decorDecription) {
	Name = name;
	this.type = type;
	this.where = where;
	this.decorDecription = decorDecription;
}
public String getName() {
	return Name;
}
public String getType() {
	return type;
}
public String getWhere() {
	return where;
}
public String getDecorDecription() {
	return decorDecription;
}
  
}
