class Group{
  String name;
  Country[] countries;
  color barColour;
  int startX, startY;
  
  
  Group (int startX, int startY, String name, color barColour, Country[] countries){
    this.name = name;
    this.startX = startX;
    this.startY = startY;
    this.barColour = barColour;
    this.countries = countries;
    
  }
}
