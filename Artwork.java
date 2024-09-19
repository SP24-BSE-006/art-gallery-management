public class Artwork(){

private string title;
private int year;
private Artist artist;

Artwork(string title,int year, new Artist(string artist)){

this.title = title;
this.year = year;
this.artist = artist;
}
  

Artwork(string title,int year){
this.title = title;
this.year = year;
this.artist = Artist();
}


public string gettame(){
return title;
}
public string getyear(){
return year;
}

public string get artist(){
return artist;
}

public void display(){
System.out.println("Title :"+title);
}

public void display(){
System.out.println("Year :"+year);
}
