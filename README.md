## Java Fundamentos

- Bibliotecas
    
    Java.lang → é um pacote basico do java que ja vem por padrão
    
    java.util.Scanner → para podermos pegar dados de entrada 
    
    ### Introdução ao Swing
    
    Biblioteca Swing é uma lib visual, para criar interfaces graficas desktop. 
    
    import javax.swing;
    
    ### Java FX
    
    Tem a mesma base do Swing porem é multplataforma
    
- **Comentarios em JAVA**
    
    ```java
    //Comentario 1 linha
    /*
    *Varias
    *linhas
    */
    ```
    
- **Tipos primitivos**
    
    Uma variável é um objeto normalmente localizado na memória utilizado para representar valores, quando declaramos uma variável estamos associando seu nome (identificador) ao local da memória onde está armazenado sua informação, as variáveis em Java podem ser do tipo **primitivo** ou **objeto**:
    
    - **Variáveis primitivas**: podem ser do tipo [byte](http://www.universidadejava.com.br/java/java-tipo-numerico-inteiro/), [short](http://www.universidadejava.com.br/java/java-tipo-numerico-inteiro/), [int](http://www.universidadejava.com.br/java/java-tipo-numerico-inteiro/), [long](http://www.universidadejava.com.br/java/java-tipo-numerico-inteiro/), [float](http://www.universidadejava.com.br/java/java-tipo-numerico-ponto-flutuante/), [double](http://www.universidadejava.com.br/java/java-tipo-numerico-ponto-flutuante/), [char](http://www.universidadejava.com.br/java/java-tipo-caractere/) ou [boolean](http://www.universidadejava.com.br/java/java-tipo-boolean/).
    
    
    ```java
    //Formas de declaração de variavel:
    int idade = 0; // Moodo normal Inteiro
    float sal = 1825.54f; //Modo normal Float(obrigatorio ter o F no final )
    char letra = 'G';//Modo normal char (somente 1 letra)
    boolean casado=false; //Modo normal bollean 
    
    int idade = (int) 3; //Typecasts inteiro
    float sal = (float) 1825.54 //Typecasts float
    char letra= (char) 'G'; //Typecasts char
    boolean casado= (boolean) false; //Typecasts bolean
    
    Integer idade = new Integer(3); //Wrapper class 
    Float sal = new Float(1825.54); //Wrapper class 
    Character letra = new Character('G'); //Wrapper class 
    Boolean casado = new Bollean(false); //Wrapper class 
    ```
    
    - **Saídas de dados**
    
    ```java
    float nota = 8.5f;
    String nome = "Gabriel";
    
    System.out.print("Sua nota é" + nota);
    System.out.println("Sua nota é" + nota); //pula a linha
    System.out.printf("A nota de %s é %.2f \n",nome,nota); // usando o printf faz com que..
    // %s => Puxa a string e %f puxa o float(%.2 indica a quantidade d casa decimais).
    System.out.format("A nota de %s é %.1f \n",nome,nota); //mesma coisa só que com format
    ```
    
    - **Entrada de Dados**
    
    ```java
    import java.util.Scanner
    Scanner teclado = new Scanner(System.in); //Instansiando a classe para ler 
    String nome = teclado.nextLine(); // Lendo uma String nextline
    float nota = teclado.nextFloat(); // Lendo um float nextFloat
    int idade = teclado.nextInt(); // lendo um inteiro
    ```
    
    - **Incompatibilidade entre String e inteiro**
    
    ```java
    //Java é uma linguagem fortemente tipada, ai precisamos da warper classes para fazer a
    // conversão
    int idade = 30;
    String valor = idade; //Int não pode ser convertido para String 
    String valor = (String) idade; // não funciona nem com Typecast
    String valor = Integer.toString(idade) // esse é o jeito certo de converter 
    
    //Exemplo aocontrario
    String valor = "30";
    int idade = valor; //não funciona
    int idade = Integer.parseInt(valor); // Converte de String para INT 
    int idade = Float.parseFloat(valor); // Converte de String para float
    
    ```
    
- **Operadores Aritméticos e Classe Math**
    
    ```java
    //**Operadores Aritméticos**
    + adição
    - Substração
    / Divisão
    * Multiplicação
    % Resto da divisão 
    
    //**Operadores Unários
    ++ Incremento  Exemplo| a++ = a+1
    ++ Pré Incremento  Exemplo| ++a // Serve para somas ele vai ser somado antes de fazer a operaçao
    -- Decremento  Exemplo| a-- = a-1**
    
    //**Operadores de Atribuição**
    += **Incremento  Exemplo| int a=4; a += 2 //= a= a + 2**
    -= Substração  **Exemplo| int a=4; a -= 2 //= a= a - 2**
    /= Divisão     **Exemplo| int a=4; a /= 2 //= a= a / 2**
    *= Multiplicação   **Exemplo| int a=4; a *= 2 //= a= a * 2**
    %= Resto da divisão   **Exemplo| int a=4; a %= 2 //= a= a % 2
    
    //Clase para realizar calcolus mais complexos
    Classe Math
    PI |Contante PI | Math.PI
    pow |Exponenciação | Math.pow(5,2) = 5^2
    sqrt |Raiz quadrada | Math.sqrt(25) = 5
    cbrt| Raiz Cúbica| Math.cbrt(27) = 3
    
    //Arredondamentos
    abs|Valor Absoluto| Math.abs(-10) = 10 //Transforma todo negativo em positivo
    floor | Arredonda para baixo | Math.floor(3.9) = 3 
    ceil | Arredonda para cima | Math.ceil(4.2) = 5
    round | Arrendoda Aritmeticamente | Math.round(5.6) = 6 // Jeito normal 
    
    //Gerador de Numero
    Math.random(); // gera um numero aleatorio entre 0 e 1 usado como double
    5+ Math.random() * (10-5)
    /*
    Para gerar um numero aleatorio dentro de um range expecifico é mei complicado
    No exmplo a cima o range é entre 5 a 10 
    caso queira fazer de 0 a 100 
    voce deve mudar o 5 pra 0 e 10 pra 100
    */**
    
    ```
    
    - **Operador Ternário**
    
    Esse operador faz toda a logica de diferentes resultados como se fosse um if else 
    
    ```java
    é como se fosse:
    if (n1>n2){
    				r=n1;}
    						else{
    									r=n2;}
    
    mas utilizando dessa forma faz a mesma coisa
    o ? => questiona o resultado 
    o : => informa as duas opçoes de resultado 
    r = (n1>n2)?0:1;
    
    Exemplo
    int n1, n2 , r;
    n1 = 4;
    n2 = 8;
    r = (n1>n2)?0:1;
    System.out.print(r);
    ```
    
    - **Operadores Relacionais**
    
    ```java
    >  |Maior que  | 5>2 | true
    <  |Menor que  | 4<1 | false
    >= |Maior ou igual a | 8>=3 | true
    >= |Menor ou igual a | 6<=6 | true
    == |Igual a          | 9==8 | false
    != |Diferente de     | 4!=5 | true 
    
    Faz a verificação se o conteudo dos objetos é igual a da String mesmo 
    se forem de tipos diferentes 
    
    r = (n1.equals(n2))?"Igual":"Diferente";
    ```
    
- **Operadores Lógicos**
    
    ```java
    &&  |  .E.  | true && false  | false
    ||  |  .OU. | false || true  | true
    ^   |  .XOU. | true^true     | false // Uma ou exclusivamente a outra, somente 1 das duas
    !   |  .NAO. | !false        | true 
    ```
    

## Estruturas Condicionais

- **Condição Simples:**

Somente IF


```java
Scanner teclado = new Scanner(System.in);
float n1 =teclado.nextFloat();
float n2 =teclado.nextFloat();
float m = (n1+n2)/2;
Sysyem.out.print(m);

if(m>9){
 System.out.println("Parabens")
}

```

- **Condição Composta**:

Possui IF e else

- **Estruturas Compostas Encadeado**
    
    
- Condição de Multipla Escolha

Switch Case

## Estruturas de Repetição

Existem 3 tipos de repetição

- Enquanto (While)
- Repita (Do While) → While ao contrario
- Para (For) → temos o for each

### Enquanto

Repetição com teste logico no inicio

```java
int c= 0;
while(c<4){
System.out.println("Cambalhota" + (c+1));
c++;
}
```

Mundando o fluxo do laço 

```java
int c= 0;
while(c<10){
if(c ==5 || c==7){
continue; // ou break-> ele para 
}
System.out.println("Cambalhota" + (c+1));

c++;
}
```

Estrutura no final

```java
int c -0
do{
System.out.println("Cambalhota" + (c+1));
c++;
} while(c<4);

```

Estrutura de repetição com variavel de Controle

```java
for (int c=0;c<=3;c++) {
System.out.println("Cambalhota");
}
```

## Variaveis compostas

### Vetores

```java
int n[] = new int [4]; // Um array é um objeto dentro do java
n[0]=3;
n[1]=5;
n[2]=8;
n[3]=2;

int n[] = {3,5,8,2} // Podemos declarar dessa forma
sout("O total de casas são"+ n.lenght());
for (int c=0;c<=n.lenght()-1;c++){
 sout("Na posição"+ c + "temos o valor " n[c] );
```

### For each

Para cada….

```java
int num[]= {3,5,1,8,4};
Arrays.sort(v);//Ele deixa o vetor em ordem 
for (int valor:v){
}

//Bucar no array, busca binaria 
int vet[]= {3,5,1,8,4};
int p= Arrays.binarySearch(vet,1); //Encontra a possição do vetor
sout()

//Preencher vetores automaticamente
Arrays.fill(vet, 0); //Preenche todos os vetores 
```

## Metodos

### **Procedimento**→ não retornam valor

Importante se atentar que não podemos criar um procedimento dentro de um clase estatica, somente se esse procedimento tambem for estatico

Por exemplo:

```java
static void soma(int a, int b){
	int s= a+b;
	sout(s);
}

public static void main(String[] args){
soma(5,2) //Aplicamos os valores 
}
```

### Funçoes

Parce muito com procedimento mas ele possui um retorno 

```java
static int soma(int a, int b){
int s = a+b;
return s;
}

public static void main(String[] args){
int s= soma(5,2) //Necessario atribuir dentro de uma variavel
}
```

## Orientação Objetos

### Conceitos

- **Coesão** é algo que esta relacionado ao proposito da sua clase
- Clases definem um valor :

```java
Carro carro1 = new Carro();
        carro.nome = "HB20";
        carro.modelo = "Ford Ka";
        carro.ano = 2010;
```

- Metodo se parecem com classes(Sem retorno):

Esse sem retorno significa que voce não passa nenhum parametro para o metodo, voce somente recebe o resultado

```java
Calculadora calculadora = new Calculadora();
calculadora.somaDoisNumeros();// metodo
```

- Metodos com parametros

```java
//Clase domain 
public void multiplicaDoisNumeros(int n1, int n2){
        System.out.println(n1*n2);
    }
//Classe main
public static void main(String[] args) {
calculadora.multiplicaDoisNumeros(50,2); //passando os parametros 
}
```

- Metodos com retorno

Com retorno é necessario colocar dentro de uma variavel do mesmo tipo

```java
//Clase domain 
public double dividaDoisNumeros(double n1, double n2){
        return n1/n2;
}
//Classe main
double result =  calculadora.dividaDoisNumeros(20,2);
        System.out.println(result);
```

- **Metodos** de **Referência this**

```java
//Clase de dominio 
public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){ //Colocamos ja o metodo na definição de classe 
        System.out.println("Nome:"+this.nome);// e utilizamos o this. para citar a variavel que queremos
        System.out.println("Nome:"+this.nome);
        System.out.println("Nome:"+this.nome);
    }
}
```

- **Varargs**

normalmente para definirmos um metodo de repetição de array fazemos dessa forma:

```java
//Domain
public void somaArray(int [] numeros){
        int soma =0;
        for (int num :numeros) {
            soma += num;

        }
        System.out.println(soma);
    }
//Teste
int [] numeros = {1,2,3,4,5};
    calculadora.somaArray(numeros);
```

Então no caso temos que criar uma variavel para passar como argumento 

mas com o varargs é diferente 

podemos fazer dessa forma:

```java
//Domain
public void somaVarArgs(int... numeros){ //Sintaxe um pouco diferente
    int soma =0;
    for (int num :numeros) {
        soma += num;
    }
    System.out.println(soma);
}
//teste
calculadora.somaVarArgs(1,2,3,4,5); //podemos passar o conteudo do array direto 
```

- **Sobrecarga de Metodos**
    
    Sobrecarga de metodos é usada para quando formos alterar o metodo podermos replicalo sem precisar alterar a sua instancia, fazemos isso adicionado mais um metodo exatamente com o mesmo nome para repllicarmos:
    
    ```java
    //Domain
    public void init(String nome, String tipo, int episodios){
            this.nome = nome;
            this.tipo= tipo;
            this.episodios= episodios;
    
        }
        public void init(String nome, String tipo, int episodios,String genero){ //Sobrecarga de metodos
            this.init(nome,tipo,episodios);
            this.genero= genero;
        }
    //Teste
    public static void main(String[] args) {
            Anime anime = new Anime();
            anime.init("Boku no pico","TV",18, "genero"); //Só adicionar o novo elemento
    ~~~~        anime.imprime();
    ```
    
- **Blocos de inicialização 
Blocos de inicialização** são parecidos com os **contrutores**, mas eles não precisam ser reinicializados em novos objetos, para usar eles basta adicionar { } da seguinte forma:

```java
//Entrando no Blooco de inicilização
{
        System.out.println("Bloco de Inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;

        }
  }
```

- Modificador Static
O modificador Static tem o objetivo de dar a um atributo um valor fixo para toda a classe, não somente para um unico objeto, por exemplo:

 

```java
//Domain
public class Carro {
    private  String nome;
    private double velociadadeMaxima;
    public static double velocidadeLimite = 250; // Modificador Static transforma esse vallor fixo para todos os objetos instanciados
} 
public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

//Teste

Carro.setVelocidadeLimite(180);//Ai para alteramos o valor desse atributo precisamos chamalo pela classe
```
