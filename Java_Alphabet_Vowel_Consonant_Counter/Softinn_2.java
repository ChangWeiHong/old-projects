package softinn_2;

import java.util.Scanner;

/**
 *
 * @author CHANG WEI HONG
 */
public class Softinn_2 {

    public static void main(String[] args) {
        int a = 0,b = 0,c = 0,d = 0,e = 0,f = 0,g = 0,h = 0,i = 0,j = 0,k = 0,l = 0,m= 0,n= 0,o= 0,p= 0,q= 0,r= 0,s= 0,t= 0,u= 0,v= 0,w = 0,x = 0,y = 0,z = 0;
        int dot=0, space=0,other=0;
        String longest = null;
        System.out.println("Inser Text: （Press ‘Enter’ to mark end of input）");
        System.out.print(">>> ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\W+");
        int temp_max, position_max = 0;
        temp_max = words[0].length();
        for (int cu =0; cu< words.length; cu++){
            if ( temp_max < words[cu].length()){
                temp_max = words[cu].length();
                position_max = cu;
                longest = words[cu];
            }
        }
        
        for( int co =0; co< sentence.length(); co++ )
        {
            char ch = sentence.toLowerCase().charAt(co);
            if(ch == 'a') 
            {
                a++;
            }
            else if(ch == 'b') 
            {
                b++;
            }
            else if(ch == 'c') 
            {
                c++;
            }
            else if(ch == 'd') 
            {
                d ++;
            }
            else if(ch == 'e') 
            {
                e++;
            }
            else if(ch == 'f') 
            {
                f++;
            }
            else if(ch == 'g') 
            {
                g++;
            }
            else if(ch == 'h') 
            {
                h++;
            }
            else if(ch == 'i') 
            {
                i++;
            }
            else if(ch == 'j') 
            {
                j++;
            }
            else if(ch == 'k') 
            {
                k++;
            }
            else if(ch == 'l') 
            {
                l++;
            }
            else if(ch == 'm') 
            {
                m++;
            }
            else if(ch == 'n') 
            {
                n++;
            }
            else if(ch == 'o') 
            {
                o++;
            }
            else if(ch == 'p') 
            {
                p++;
            }
            else if(ch == 'q') 
            {
                q++;
            }
            else if(ch == 'r') 
            {
                r++;
            }
            else if(ch == 's') 
            {
                s++;
            }
            else if(ch == 't') 
            {
                t++;
            }
            else if(ch == 'u') 
            {
                u++;
            }
            else if(ch == 'v') 
            {
                v++;
            }
            else if(ch == 'w') 
            {
                w++;
            }
            else if(ch == 'x') 
            {
                x++;
            }
            else if(ch == 'y') 
            {
                y++;
            }
            else if(ch == 'z') 
            {
                z++;
            }
            else if(ch == ' ') 
            {
                space++;
            }
            else if(ch == '.') 
            {
                dot++;
            }
        }
        
        System.out.print("Vowels:");
        if(a>0){
            System.out.print(" A(" +a+ ")");
        }
        if(e>0){
            System.out.print(" E(" +e+ ")");
        }
        if(i>0){
            System.out.print(" I(" +i+ ")");
        }
        if(o>0){
            System.out.print(" O(" +o+ ")");
        }
        if(u>0){
            System.out.print(" U(" +u+ ")");
        }
        
        System.out.print("\nConsonants:");
        if(b>0){
            System.out.print(" B(" +b+ ")");
        }
        if(c>0){
            System.out.print(" C(" +c+ ")");
        }
        if(d>0){
            System.out.print(" D(" +d+ ")");
        }
        if(f>0){
            System.out.print(" F(" +f+ ")");
        }
        if(g>0){
            System.out.print(" G(" +g+ ")");
        }
        if(h>0){
            System.out.print(" H(" +h+ ")");
        }
        if(j>0){
            System.out.print(" J(" +j+ ")");
        }
        if(k>0){
            System.out.print(" K(" +k+ ")");
        }
        if(l>0){
            System.out.print(" L(" +l+ ")");
        }
        if(m>0){
            System.out.print(" M(" +m+ ")");
        }
        if(n>0){
            System.out.print(" N(" +n+ ")");
        }
        if(o>0){
            System.out.print(" O(" +o+ ")");
        }
        if(p>0){
            System.out.print(" P(" +p+ ")");
        }
        if(q>0){
            System.out.print(" Q(" +q+ ")");
        }
        if(r>0){
            System.out.print(" R(" +r+ ")");
        }
        if(s>0){
            System.out.print(" S(" +s+ ")");
        }
        if(t>0){
            System.out.print(" T(" +t+ ")");
        }
        if(v>0){
            System.out.print(" V(" +v+ ")");
        }
        if(w>0){
            System.out.print(" W(" +w+ ")");
        }
        if(x>0){
            System.out.print(" X(" +x+ ")");
        }
        if(y>0){
            System.out.print(" Y(" +y+ ")");
        }
        if(z>0){
            System.out.print(" Z(" +z+ ")");
        }
        
        System.out.print("\nOther characters:");
        if(space>0){
            System.out.print(" [blank space](" +space+ ")");
        }
        if(dot>0){
            System.out.print(" .(" +dot+ ")");
        }
        
        System.out.print("\nThe longest word: "+longest);
        System.out.println();
        
    }
    
}
