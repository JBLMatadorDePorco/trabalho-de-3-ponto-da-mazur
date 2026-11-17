import java.io.BufferedReader; 
import java.io.FileReader; 
BufferedReader leitor = new BufferedReader(new FileReader("nomes.txt")); 
String linha; 
while ((linha = leitor.readLine()) != null) 
 System.out.println(linha); 
leitor.close(); 
