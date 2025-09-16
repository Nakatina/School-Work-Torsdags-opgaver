//3.a Her er global string array med kunstner
String[] artists = {"Grandmaster Flash", "Run DMC", "Tupac", "Notorious B.I.G", "Missy Elliott"};

//3.b Laver et forloop med artist med et nummer
for (int i = 0; i < artists.length; i++){
  println((i+1) +". " + artists[i]);
}
//3.c et andet string array med deres hits!
String[] hits = {"The Message", "Walk This Way", "Changes", "Juicy", "Work It"};

//3.d Kombinerer navn og hit i udskriften
for (int i = 0; i < artists.length; i++){
  println((i+1) + ". " + artists[i] + " : \"" + hits[i] + "\"");
}
