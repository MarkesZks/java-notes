## Java Fundamentos

O Java, como **plataforma de programação**, nasceu no ano de 1995 dentro dos laboratórios da empresa Sun Microsystem como resultado de uma extensa pesquisa científica e tecnológica. A plataforma Java entrega um **ambiente completo** para o **[desenvolvimento e execução de programas](https://www.alura.com.br/artigos/async-await-no-javascript-o-que-e-e-quando-usar)**, sendo composta por:

- Uma **linguagem de programação de alto nível orientada a objetos**;
- Máquina Virtual (*Java Virtual Machine* ou JVM), que garante **independência de plataforma**, pois o código executa na máquina virtual e essa pode ser portada para outras plataformas como Windows ou Linux;
- *Java Runtime Environment* ou **JRE**, que agrega a máquina virtual e alguns recursos para a execução de aplicações Java; e
- *Java Development Kit* ou **JDK**, que é um conjunto de utilitários que oferece suporte ao desenvolvimento de aplicações.

No Java, os programas são escritos em um arquivo com a extensão `.java`, que em um processo posterior serão compilados para arquivos com a extensão `.class`. Esses, por sua vez, contêm os códigos a serem executados na máquina virtual, os `bytecodes`.

## **Tecnologia Java**

A plataforma Java é estruturada em um portfólio de produtos para desenvolvimento e execução de aplicações, idealizando que um mesmo **programa** possa **funcionar em diferentes sistemas operacionais e dispositivos**. Atualmente a plataforma está dividida em duas grandes áreas:

- *Java Standard Edition* ou `JavaSE`
- *Java Enterprise Edition* ou `JavaEE`

### **Java Standard Edition ou JavaSE**

Componente padrão do Java que fornece um **ambiente** para o **desenvolvimento de aplicações** de **pequeno e médio porte**, além de um conjunto de APIs base da plataforma e a JVM padrão.

### **Java Enterprise Edition ou JavaEE**

Componente baseado no `JavaSE`, é **focado** no **desenvolvimento de aplicações empresariais multicamadas** de **grande porte** e provê serviços adicionais, ferramentas e APIs para simplificar a criação de aplicações complexas.

> 
> 

- Bibliotecas
    
    Java.lang → é um pacote basico do java que ja vem por padrão
    
    java.util.Scanner → para podermos pegar dados de entrada 
    
    A classe Scanner do Java é utilizada para ler dados de entrada em um programa Java. Esses dados podem ser lidos a partir de várias fontes de entrada, como arquivos, fluxos de entrada, Strings e até mesmo a entrada do usuário através do teclado, como vimos em aula.
    
    Ela oferece uma série de métodos para ler dados de diferentes tipos, como inteiros, números de ponto flutuante, strings e caracteres.
    
    Para utilizar a classe Scanner, primeiro é necessário importá-la no início do seu programa. Provavelmente ao incluir a mesma no código, a IDE já vai sugerir o import. Esse import ficará como descrito abaixo:
    
    ```java
    import java.util.Scanner;
    ```
    
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
- **Mapeamento de relacionamentos**
    1. Unidirecional de um para um
    2. Bidirecional de um para um
    3. Unidirecional de um para muitos
    4. Bidirecional de um para muitos
    5. Unidirecional de muitos para um
    6. Unidirecional de muitos para muitos
    7. Bidirecional de muitos para muitos
    
- **Comparação de Strings**
    
    Em Java, é possível comparar duas Strings utilizando o operador ==. Porém, esse operador verifica apenas se as duas variáveis apontam para o mesmo objeto na memória, e não se o conteúdo das Strings é igual. Para comparar o conteúdo de duas Strings, é necessário utilizar o método equals(). Por exemplo:
    
    ```csharp
    String senha = "12345";
    if (senha.equals("12345")) {
        System.out.println("Acesso autorizado!");
    }else {
        System.out.println("Senha incorreta.");
    }COPIAR CÓDIGO
    ```
    
    Nesse caso, o método `equals()` é utilizado para comparar o conteúdo da variável senha com a String "12345". Se as duas Strings forem iguais, a mensagem "Acesso autorizado!" será impressa, caso contrário, a mensagem "Senha incorreta." será impressa.
    
    Mais adiante trabalharemos também com o método `equalsIgnoreCase()`, que é usado para que a comparação de Strings desconsidere as letras maiúsculas e minúsculas. Utilizando apenas o equals, as String “alura” e “Alura” seriam consideradas diferentes.
    
- **Formatação de textos → format()**
    
    Uma das maneiras mais comuns de se formatar textos em Java é utilizando o método `format()`, da classe String. Esse método permite formatar um texto utilizando diversos placeholders, que são representados pelo caractere `%` seguido de uma letra que indica o tipo de dado que será inserido no placeholder. Por exemplo, `%s` indica que uma String será inserida no placeholder, `%d` indica um valor inteiro e `%f` indica um valor de ponto flutuante. Vamos ver um exemplo:
    
    ```csharp
    String nome = "Maria";
    int idade = 30;
    double valor = 55.9999;
    System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
    COPIAR CÓDIGO
    ```
    
    Nesse exemplo, os valores das variáveis nome, idade e valor são passados como parâmetros para o método `String.format`, substituindo os placeholders `%s`, `%d` e `%.2f`, respectivamente. O resultado impresso será "Meu nome é Maria, eu tenho 30 anos e hoje gastei 55,99 reais". Perceba também que o placeholder `%.2f` indica que o valor deve ser formatado com duas casas decimais.
    
- **Casting**
    
    **Casting implícito**
    
    O casting implícito é realizado automaticamente pelo compilador quando o tipo de dado de origem é compatível com o tipo de dado de destino. Por exemplo, é possível atribuir um valor de tipo int a uma variável do tipo double, pois o tipo double é maior e suporta todos os valores que o tipo int pode armazenar:
    
    ```cpp
    int x = 10;
    double y = x; // casting implícito
    ```
    
    **Casting explícito**
    
    O casting explícito é realizado quando o tipo de dado de origem é incompatível com o tipo de dado de destino. Nesse caso, devemos utilizar o operador de casting para realizar a conversão:
    
    ```cpp
    double x = 10.5;
    int y = (int) x; // casting explícito
    ```
- **Protected**

Permite que os atributos de uma classe sejam acessados por outras classes do mesmo pacote e também por suas subclasses, independentemente do pacote em que se encontram.

O modificador protected é útil em situações em que uma classe precisa permitir que suas subclasses acessem diretamente seus atributos, sem a necessidade de restringir o acesso apenas pelos métodos getters e setters.

```java
public class Conta {

private String titular;
protected double saldo;

public void sacar(double valor) {
    //implementacao do metodo omitida
  }

public void depositar(double valor) {
    //implementacao do metodo omitida
  }

  //getters e setters
}
```

```java
public class ContaPoupanca extends Conta {

private double taxaDeJuros;

public void calcularJuros() {
    double juros =this.saldo * taxaDeJuros;
    System.out.println("Juros atual: " +juros);
  }

  //getters e setters
}
```

Repare que agora o atributo `saldo` foi acessado diretamente pela classe `ContaPoupanca`.
- **Interface**

interfaces são uma forma de definir um **contrato** que as classes devem seguir, sendo que ele define quais métodos devem ser implementados pelas classes que o implementarem. Interfaces permitem que diferentes classes possam ser tratadas de maneira padronizada, via polimorfismo, tornando assim o código fácil de estender com novos comportamentos.

No Java, uma interface é definida usando a palavra-chave **interface**. Por exemplo:

```java
public interface Tributavel {

    double getValorImposto();

}
```

No exemplo de código anterior, estamos definindo uma interface chamada **Tributavel**, sendo que ela possui apenas um método chamado `getValorImposto()` que retorna um valor do tipo `double`. Essa interface pode ser implementada por qualquer classe que queira ser tributável no projeto.

Para implementar uma interface, usamos a palavra-chave **implements** após a definição da classe. A classe que implementa a interface deve implementar **todos** os métodos definidos na interface. Por exemplo:

```java
public class Produto implements Tributavel {

private String nome;
private double valor;

    @Override
public double getValorImposto() {
return this.valor * 0.1;
    }

    //getters e setters
}
```

## **Utilização de interfaces**

Interfaces podem ser utilizadas para definir comportamentos que podem ser aplicados a várias classes diferentes, tornando assim o código mais modular e fácil de manter.

Por exemplo, suponha que temos um sistema de vendas que precisa calcular o imposto de diferentes tipos de produtos. Podemos criar a interface `Tributavel`, para definir o comportamento de calcular imposto, e criar várias classes diferentes que implementam essa interface para calcular o imposto de diferentes produtos. Por exemplo:

```csharp
public class CalculadoraImposto {

private double totalImposto = 0;

public void calcularImposto(Tributavel item) {
this.totalImposto += item.getValorImposto();
    }

public double getTotalImposto() {
return this.totalImposto;
    }

}
```

Nesse exemplo, estamos criando uma classe chamada **CalculadoraImposto**, que tem um atributo privado chamado `totalImposto`, que armazena o valor total dos impostos.

Repare que o método `calcularImposto` recebe um parâmetro do tipo `Tributavel`. Ao declarar uma variável com o tipo de uma interface, como é feito nesse método, podemos atribuir a essa variável qualquer objeto que implemente essa interface, ou seja, tanto um objeto do tipo `Servico` quanto `Produto`. Para ambos os casos, a `CalculadoraImposto` irá chamar o método implementado na classe específica. Ou seja, para um produto, irá chamar o método *getTotalImposto* implementado na classe **Produto**. E para um serviço, irá chamar o método *getTotalImposto* implementado na classe **Servico**.

Isso é muito útil quando queremos tratar vários objetos de classes diferentes de forma semelhante, permitindo que diferentes classes possam ser tratadas de maneira padronizada, facilitando a manutenção e extensão do código. Esse é mais um exemplo de aplicação do polimorfismo em Java, mas agora com a utilização de interfaces.

### Array List

**Arrays** são estruturas de dados que permitem armazenar uma coleção de elementos do mesmo tipo. Eles são muito utilizados para manipulação de dados em projetos de programação.

Para declarar um array em Java, é preciso definir seu tipo e tamanho. Por exemplo, para criar um array de inteiros com tamanho 5, podemos escrever o seguinte código:

**`int**[] numeros = **new** **int**[5];`

Aqui, estamos declarando um array chamado "**numeros**" do tipo "**int**" e com tamanho 5. É importante lembrar que o índice dos elementos de um array começa em 0 e vai até o tamanho do array menos 1.

Após declarar um array, podemos inicializá-lo com valores. Por exemplo, podemos preencher o array "numeros" com os números de 1 a 5 da seguinte forma:

```cpp
for (int i = 0; i < numeros.length; i++) {
    numeros[i] = i + 1;
}
```

Aqui, estamos percorrendo o array "numeros" utilizando um loop for e preenchendo cada posição com seu respectivo índice mais 1.

Também é possível criar arrays de objetos e não apenas de tipos primitivos. Por exemplo:

```java
Filme[] filmes =newFilme[2];

Filme filme1 =newFilme("Avatar", 2009);
Filme filme2 =newFilme("Dogville", 2003);

filmes[0] = filme1;
filmes[1] = filme2;
```

Embora os arrays sejam úteis, eles possuem algumas limitações que podem causar problemas em projetos. Alguns desses problemas incluem:

1. Tamanho fixo: o tamanho de um array é fixo e não pode ser alterado após a sua criação. Isso pode ser problemático em situações em que o tamanho dos dados a serem armazenados é desconhecido ou variável.
2. Ausência de métodos: arrays não possuem métodos que permitam a inserção, remoção ou pesquisa de elementos de forma eficiente. Isso pode levar a soluções de código complicadas e ineficientes para tarefas simples.

Justamente por conta desses problemas e dificuldades é que não devemos utilizar arrays para representar uma coleção de elementos, mas sim alguma classe do Java, como a ArrayList, que encapsula e abstrai um array, facilitando a sua utilização via métodos e deixando o código do projeto mais simples de entender e evoluir.

**Criando um Array:**

```java
 ArrayList<Filme> listaDeFilmes = new ArrayList<>();
```

<aside>
💡 Não existe heraça de construtores;

</aside>

Podemos criar um contrutor que precisa ser herdado da seguinte forma:

 

```java
    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }
```

### **Outra formas de percorrer a Lista**

A forma mais comum de percorrer uma lista no Java é utilizando o laço foreach tradicional, também conhecido como for-each. Esse laço permite que se percorra todos os elementos de uma lista, sem a necessidade de se preocupar com índices ou o tamanho dela, tornando o código mais simples e legível. Por exemplo, suponha que tenhamos uma lista de nomes de pessoas e que desejamos imprimi-los na tela:

```java
ArrayList<String> nomes = new ArrayList<>();
nomes.add("Jacqueline");
nomes.add("Paulo");
nomes.add("Suellen");
nomes.add("Emily");

for (String nome : nomes) {
    System.out.println(nome);
}
```

Esse loop for percorre todos os elementos da lista, atribuindo cada um deles à variável `nome`, que é usada para imprimir o valor na tela. Esse tipo de loop é muito útil em situações onde não precisamos realizar nenhuma operação complexa sobre os elementos da lista.

No entanto, a partir do Java 8, foi adicionado na interface `List`, a qual a classe `ArrayList` implementa, um novo método chamado **forEach**, que possibilita a iteração sobre os elementos da lista de forma mais concisa e elegante. Por exemplo, o exemplo anterior pode ser reescrito utilizando o método forEach da seguinte forma:

```java
nomes.forEach(nome -> System.out.println(nome));
```

Nesse caso, o método forEach é chamado sobre a lista nomes e recebe como parâmetro uma expressão lambda que realiza a impressão do valor na tela. A expressão lambda `nome -> System.out.println(nome)` é uma forma compacta de definir uma função que recebe um parâmetro nome e realiza a operação de impressão.

É possível simplificar ainda mais o exemplo de código anterior, utilizando o recurso conhecido como **Method Reference**, que nada mais é do que uma forma reduzida de uma expressão lambda:

```java
nomes.forEach(System.out::println);
```

No código anterior, o símbolo **::** é a sintaxe do Method Reference, que no exemplo mostrado faz uma referência para o método `println`.

**instanceof 
V**erificar se um objeto é uma instância de uma determinada classe. Ele retorna um valor booleano, ou seja, verdadeiro ou falso, indicando se o objeto é uma instância da classe especificada. Por exemplo, se tivermos um objeto chamado `item` e quisermos verificar se ele é uma instância da classe `Filme`, podemos usar o comando `if (item instanceof Filme)`. Isso nos permite realizar ações específicas com base no tipo do objeto, como no exemplo em que verificamos se o item é um filme para então mostrar a classificação do filme. 

```java
 if (item instanceof Filme filme){
                /*Instanceof verifica o tipo do objeto*/
                System.out.println(filme.getClassificacao());
            }
```

### **Variáveis e referências**

Referências são **ponteiros** para objetos em memória, ou seja, elas apontam para um objeto e permitem que você trabalhe com ele. No Java, toda variável de objeto é na verdade uma referência a esse objeto que foi alocado na memória.

Quando você instancia um objeto, está, na realidade, criando um novo bloco de memória que armazena as informações desse objeto. A maneira de chegar a esse bloco de memória, para armazenar e ler informações dele, ocorre por meio de uma referência, que é representada por uma variável. Por exemplo:

```java
Filme filme1 =new Filme("Avatar", 2009);
```

No exemplo de código anterior, criamos um novo objeto da classe `Filme` e armazenamos uma referência a ele na variável `filme1`.

É importante lembrar que as referências a objetos em Java não são o próprio objeto em si, pois elas apenas apontam para o objeto. Quando você passa uma referência a um método ou atribui uma referência a outra variável, está apenas copiando o valor da referência e não do objeto em si. Por exemplo:

```java
Filme filme1 =new Filme("Avatar", 2009);
Filme filme2 =new Filme("The Matrix", 1999);
Filme filme3 = filme1;
```

No exemplo de código anterior, foram criados apenas dois objetos em memória. A variável `filme3` é apenas uma referência que aponta para o mesmo objeto sendo referenciado pela variável `filme1`.

Uma questão importante relacionada com referências a objetos em Java é a questão da igualdade e identidade de objetos. Quando você compara duas referências de objeto usando o operador de igualdade **==**, está comparando as referências em si, não os objetos que elas apontam. Por exemplo:

```csharp
Filme filme1 =new Filme("Avatar", 2009);
Filme filme2 =new Filme("Avatar", 2009);

if (filme1 == filme2) {
    System.out.println("Iguais");
}else {
    System.out.println("Diferentes");
}
```

No exemplo de código anterior, a saída no console será: "Diferentes". Embora os dois objetos tenham as mesmas informações na memória, a comparação com **==** verifica se as referências são iguais, ou seja, se apontam para o mesmo objeto na memória.

### Ordernar uma lista

- **Para ordernamos um lista de tipos iguais em ordem alfabetica/numerica utilizamos o seguinte codigo:**

```java
Collections.sort(buscaPorArtistas);
//buscaPorArtistas Seria no caso o nosso array
```

Porem para fazermos isso com Classes de tipos de objetos que não existem por padrão por exemplos “Titulo” temos que adicionar uma interface padrão do java dentro da nossa classe.

`Comparable`, que define um contrato de comparação entre objetos do mesmo tipo.

```java
public class Titulo implements Comparable<Titulo>{
```

Quando uma classe implementa a interface `Comparable`, ela deve sobrescrever o método `compareTo()`. Esse método é responsável por definir a lógica de comparação entre duas instâncias da classe. Por exemplo, se tivéssemos uma classe `Livro` e quiséssemos comparar os livros com base no título, implementaríamos a interface `Comparable` e sobrescreveríamos o método `compareTo()` para comparar os títulos dos livros.

```java
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
```

Além da interface `Comparable`, o Java possui uma outra interface chamada `Comparator`, que nos fornece outra alternativa para ordenação de coleções.

Você pode entender melhor a diferença entre elas, com exemplos em códigos, lendo o [artigo Ordenando coleções com Comparable e Comparator](https://www.alura.com.br/artigos/ordenando-colecoes-com-comparable-e-comparator?_gl=1*7ljbto*_ga*Mzc3NTIxMDAuMTcwNjcyNDQ1Mw..*_ga_1EPWSW3PCS*MTcxMTA3NTg0My44MS4xLjE3MTEwNzYzMzYuMC4wLjA.*_fplc*TG9MNmpxUVlPR0wydCUyRmVBeFNTOFJvcEZlNkU5SUNNJTJCYXlOZ2N4WkZGcElOTjJzVjlVNlBvZ2VCY3BnTzh5UVA1ZUFiZ3R4U04zZGNDUndOYnVjcUJ1d0tTJTJCaVd4U2tKOXJLcXFERUdLJTJGMG9FUW1jNzl5cXJrc2ZuWndDVnclM0QlM0Q.).

   

- **Diferença entre `Comparable` e o `Comparator`**

O `Comparable` e o `Comparator` são duas interfaces em Java que permitem a comparação e a ordenação de objetos, mas de maneiras diferentes.

A interface `Comparable` é usada para definir a lógica de comparação dentro da própria classe do objeto. Quando uma classe implementa a interface `Comparable`, ela fornece uma maneira de comparar instâncias da mesma classe. Isso significa que a lógica de comparação é embutida na própria classe do objeto.

Por outro lado, a interface `Comparator` é usada para definir um critério de comparação separado da classe principal. Isso é útil quando você deseja fornecer diferentes maneiras de ordenar objetos ou quando não pode modificar a classe do objeto para implementar `Comparable`. Com o `Comparator`, você pode definir várias lógicas de comparação sem modificar a classe do objeto.

Em resumo, o `Comparable` é usado para definir a lógica de comparação dentro da classe do objeto, enquanto o `Comparator` é usado para definir critérios de comparação externos à classe do objeto. Ambos são úteis em diferentes situações, e a escolha entre eles depende do contexto e dos requisitos do sistema.

```java
lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

System.out.println("Ordem por ano "+lista);
```

## Tipos de listas

## **ArrayList**

A principal característica do ArrayList é que ele é baseado em um array dinâmico. Ele armazena os elementos em uma matriz interna e, conforme novos elementos são adicionados, o tamanho da matriz é automaticamente ajustado para acomodar o novo elemento. Da mesma forma, quando um elemento é removido, o tamanho do array é ajustado para evitar o desperdício de espaço. O ArrayList é amplamente utilizado devido à sua facilidade de uso e eficiência em termos de desempenho.

## **LinkedList**

A classe LinkedList fornece uma lista encadeada de elementos. Diferentemente do ArrayList, que é baseado em um array, o LinkedList é baseado em uma lista encadeada, o que significa que cada elemento da lista é um objeto que contém uma referência para o próximo elemento. Isso permite que os elementos sejam adicionados e removidos de maneira eficiente em qualquer posição da lista, mas pode tornar a pesquisa de um elemento específico menos eficiente.

O LinkedList é uma boa escolha quando a inserção e remoção de elementos em qualquer posição da lista é frequente e quando não é necessário acessar os elementos de forma aleatória.

## **Vector**

A classe Vector é semelhante ao ArrayList, mas é sincronizada, o que significa que é segura para uso em threads concorrentes. No entanto, a sincronização adiciona uma sobrecarga de desempenho, então o Vector pode ser mais lento que o ArrayList em algumas situações.

## **Stack**

A classe Stack implementa uma pilha, que é uma coleção ordenada de elementos onde a inserção e remoção de elementos ocorrem sempre no mesmo extremo da lista. Os elementos são adicionados e removidos em uma ordem conhecida como "last-in, first-out" (LIFO), ou seja, o último elemento adicionado é o primeiro a ser removido. A classe Stack é usada com frequência em algoritmos de processamento de texto, bem como em outras situações em que a LIFO é a maneira natural de organizar os dados.

Cada uma dessas classes tem seus próprios pontos fortes e fracos, e a escolha de qual usar dependerá das necessidades específicas da aplicação. Para um melhor entendimento sobre estruturas de dados, recomendamos a leitura dos seguintes artigos:

1. [Estruturas de dados: uma introdução](https://www.alura.com.br/artigos/estruturas-de-dados-introducao?_gl=1*sj4uqo*_ga*Mzc3NTIxMDAuMTcwNjcyNDQ1Mw..*_ga_1EPWSW3PCS*MTcxMTQwNDc1Mi44NS4xLjE3MTE0MDYyNTYuMC4wLjA.*_fplc*bFB4SEdjUnl0NlNLMUJ2TVp4aVFxb3FOVXRTNXRTek1xdG5JZnNsMFhrYWRmaUtGckg4TnM5MXRweHRjSDJWcXVRV1BLVnBrQXhXRGJwMkIxVzhKSDBHbjVURjFTbFNtSjdJJTJCcjVQN2x5NkxLcmhURFl5Y2I1U1hLUkpUZXclM0QlM0Q.)
2. [Estrutura de Dados: computação na prática com Java](https://www.alura.com.br/artigos/estrutura-dados-computacao-na-pratica-com-java?_gl=1*sj4uqo*_ga*Mzc3NTIxMDAuMTcwNjcyNDQ1Mw..*_ga_1EPWSW3PCS*MTcxMTQwNDc1Mi44NS4xLjE3MTE0MDYyNTYuMC4wLjA.*_fplc*bFB4SEdjUnl0NlNLMUJ2TVp4aVFxb3FOVXRTNXRTek1xdG5JZnNsMFhrYWRmaUtGckg4TnM5MXRweHRjSDJWcXVRV1BLVnBrQXhXRGJwMkIxVzhKSDBHbjVURjFTbFNtSjdJJTJCcjVQN2x5NkxLcmhURFl5Y2I1U1hLUkpUZXclM0QlM0Q.)

## **Map**

O Map é uma **interface** que permite que os desenvolvedores associem chaves a valores. É uma estrutura de dados útil para muitas aplicações Java, especialmente aquelas que envolvem a manipulação de grandes quantidades de dados, portanto, é comum usá-lo para realizar buscas, atualização e recuperação de elementos por chaves

Ele é implementado por diversas classes, sendo a mais comum delas o HashMap.

## **HashMap**

O HashMap é uma **classe** que implementa a interface Map usando uma tabela hash para armazenar os pares chave-valor. Ele é conhecido por sua eficiência em termos de tempo de execução. Essa classe tem uma complexidade de tempo O(1) - constante - para inserção, recuperação e remoção de elementos. Isso significa que o desempenho do HashMap não depende do tamanho da coleção de dados!

No entanto, é importante lembrar que o HashMap não mantém a ordem de inserção dos elementos e não garante a ordem dos elementos na saída. Isso ocorre porque a ordem dos elementos depende da função de hash usada para mapear as chaves para índices na tabela hash. Além disso, o desempenho do HashMap pode ser afetado se houver muitas colisões de hash entre as chaves.

Por exemplo:

```csharp
import java.util.HashMap;
import java.util.Map;

publicclassExemploHashMap {

publicstaticvoidmain(String[] args) {
        //Criando um objeto da classe HashMap que implementa a interface Map
        Map<String, Integer> usandoHashMap =new HashMap<>();

        // Adicionando pares chave-valor
        usandoHashMap.put("Gatos", 1);
        usandoHashMap.put("Cachorros", 2);
        usandoHashMap.put("Roedores", 3);

        // Acessando um valor através de uma chave
        int valor = usandoHashMap.get("Cachorros");
        System.out.println("Valor da chave Cachorros: " + valor);

        // Removendo um par chave-valor
        usandoHashMap.remove("Gatos");

        // Iterando sobre as chaves
for (String chave : usandoHashMap.keySet()) {
            System.out.println("Chave: " + chave);
            System.out.println("Valor: " + usandoHashMap.get(chave));
        }
    }
}

```

O resultado será:

```yaml
Valor da chave Cachorros: 2
Chave: Cachorros
Valor: 2
Chave: Roedores
Valor: 3
```

---

# API

## API Key

A **API Key**, ou chave de API, é um tipo de identificação que é utilizada para controlar o acesso aos serviços disponibilizados por uma API. Ela funciona como uma espécie de "chave" que os desenvolvedores precisam apresentar para acessar os recursos da API. Essa chave é única para cada desenvolvedor ou aplicativo e é utilizada para autenticar e autorizar as requisições feitas à API. Em resumo, a API Key é uma medida de segurança que permite que os provedores de API controlem quem pode acessar e utilizar os serviços oferecidos pela API.

## **integração via APIs**

A integração de sistemas é uma tarefa muito comum, pois permite que os diferentes serviços e aplicações de uma empresa funcionem em conjunto, reaproveitando soluções existentes. Uma das principais maneiras de realizar essa integração é por meio de APIs.

API (Application Programming Interface) é um conjunto de padrões, protocolos e ferramentas para construir software e aplicativos. Uma API permite que diferentes sistemas e serviços se comuniquem e troquem informações de maneira padronizada. Existem diferentes tipos de APIs, sendo que o mais comum é API Web, que utiliza o protocolo HTTP para comunicação via internet.

Um exemplo de uso de API é a integração de um sistema de vendas com um sistema de gestão financeira. Por meio de uma API, os dados de venda podem ser enviados automaticamente para o sistema financeiro, evitando a necessidade de inserção manual e reduzindo o risco de erros. Outro exemplo é o uso de uma API para integração de um aplicativo mobile com um serviço Web, para sincronização e armazenamento das informações dos usuários.

## **JSON**

O JSON (JavaScript Object Notation) é um formato de dados leve e popular para troca de informações entre sistemas, podendo ser utilizado em várias linguagens de programação.

O JSON é composto por dois tipos de estruturas de dados: **objetos** e **arrays**. Um objeto é uma coleção de pares **chave-valor**, onde as chaves são strings e os valores podem ser strings, números, booleanos, objetos ou arrays. Por exemplo:

```json
{
  "nome": "João",
  "idade": 30,
  "solteiro":false,
  "endereco": {
    "rua": "Rua 123",
    "cidade": "São Paulo",
    "estado": "SP"
  },
  "telefones": [
    "1111-1111",
    "2222-2222"
  ]
}
```

Já um array é uma coleção ordenada de valores, que podem ser strings, números, booleanos, objetos ou outros arrays. Por exemplo:

```json
[
  {
    "nome": "João",
    "idade": 30
  },
  {
    "nome": "Maria",
    "idade": 25
  },
  {
    "nome": "Pedro",
    "idade": 40
  }
]
```

O JSON é amplamente utilizado em aplicações, independente da linguagem de programação utilizada, para enviar e receber dados de APIs, sendo que para isso é recomendado utilizar alguma biblioteca que permita a serialização (conversão de objetos em JSON) e a desserialização (conversão de JSON em objetos).

## **Protocolo HTTP**

O HTTP (Hypertext Transfer Protocol) é um protocolo de comunicação que permite a transferência de informações na internet. Ele é a base para a comunicação entre navegadores e servidores Web, sendo utilizado para a transmissão de conteúdo como textos, imagens e vídeos.

O HTTP foi desenvolvido na década de 1990 e é baseado em um modelo cliente-servidor, onde um cliente (navegador Web) faz requisições a um servidor para obter informações, e o servidor responde com os dados solicitados. O HTTP utiliza o TCP (Transmission Control Protocol) como protocolo de transporte para garantir a entrega confiável dos dados.

O HTTP utiliza métodos para especificar o tipo de operação que deve ser realizada no servidor. Os principais métodos são GET, POST, PUT e DELETE. O método GET é utilizado para solicitar dados do servidor, enquanto o POST é utilizado para enviar informações para o servidor. O PUT é utilizado para atualizar informações no servidor e o DELETE é utilizado para remover informações.

Além dos métodos, o HTTP utiliza códigos de status para indicar o resultado da operação realizada. Os códigos de status variam de 100 a 599 e são divididos em cinco classes:

- 1xx: Informações
- 2xx: Sucesso
- 3xx: Redirecionamento
- 4xx: Erro do cliente
- 5xx: Erro do servidor

Caso você queira aprofundar os conhecimentos nesse protocolo, recomendamos o nosso curso [HTTP: Entendendo a web por baixo dos panos](https://cursos.alura.com.br/course/http-fundamentos).

### **Padrões de projeto**

Os padrões de projeto, também conhecidos como **design patterns**, são soluções reutilizáveis para problemas comuns de desenvolvimento de software. Eles surgiram na década de 1990, quando um grupo de desenvolvedores identificou que muitos projetos de software apresentavam problemas semelhantes, que podiam ser resolvidos por soluções também semelhantes.

Os padrões de projeto podem ser divididos em três categorias:

1. Padrões de criação: são padrões que lidam com a criação de objetos, visando garantir a flexibilidade e reutilização do código. Alguns exemplos de padrões de criação são: Factory Method, Builder e Singleton.
2. Padrões de estrutura: são padrões que lidam com a organização de objetos em estruturas maiores, buscando simplificar a comunicação entre objetos e reduzir o acoplamento entre eles. Alguns exemplos de padrões de estrutura são: Adapter, Facade e Composite.
3. Padrões de comportamento: são padrões que lidam com a comunicação entre objetos, buscando definir o comportamento esperado em situações específicas. Alguns exemplos de padrões de comportamento são: Observer, Command e Strategy.

Ao utilizar padrões de projeto, é possível aumentar a qualidade do código, tornando-o mais legível, flexível e de fácil manutenção.
## **Transformando JSON em objeto**

```java
public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

// código omitido…

        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();
        Titulo meuTitulo = gson.fromJson(json, Titulo.class);
        System.out.println("Título: " + meuTitulo.getNome());
    }
}
```

A anotação `@SerializedName` é utilizada em classes Java para especificar o nome dos campos no JSON. Isso é útil quando os nomes dos campos no JSON não correspondem diretamente aos nomes dos atributos na classe Java.

Por exemplo, se um objeto Java tem um atributo chamado "anoDeLancamento", mas no JSON esse campo é representado como "Year", podemos utilizar a anotação @SerializedName para fazer essa correspondência. Dessa forma, a biblioteca GSON consegue desserializar corretamente o JSON para o objeto Java, mesmo com nomes de campos diferentes.

Aqui está um exemplo de como a anotação `@SerializedName` é utilizada:

```java
import com.google.gson.annotations.SerializedName;

public class Titulo {
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    // outros atributos e métodos...
}
```

Neste exemplo, a anotação @SerializedName é utilizada para mapear os campos "Title" e "Year" do JSON para os atributos "nome" e "anoDeLancamento" da classe "Titulo". Isso permite que a desserialização do JSON para o objeto Java seja feita corretamente, levando em consideração os nomes diferentes dos campos.

## **Record**

Lançado oficialmente no Java 16, mas disponível desde o Java 14 de maneira experimental, o **Record** é um recurso que permite representar uma classe imutável, contendo apenas atributos, construtor e métodos de leitura, de uma maneira muito simples e enxuta.

Esse recurso se encaixa perfeitamente quando precisamos criar um objeto apenas para representar **dados**, sem nenhum tipo de comportamento.

Para se criar uma classe imutável, sem a utilização do Record, era necessário escrever muito código. Vejamos um exemplo de uma classe que representa um telefone:

```java
publicfinalclassTelefone {

privatefinal String ddd;
privatefinal String numero;

publicTelefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    @Override
publicinthashCode() {
return Objects.hash(ddd, numero);
    }

    @Override
publicbooleanequals(Object obj) {
if (this == obj) {
returntrue;
        }elseif (!(objinstanceof Telefone)) {
returnfalse;
        }else {
Telefone other = (Telefone) obj;
return Objects.equals(ddd, other.ddd)
              && Objects.equals(numero, other.numero);
        }
    }

public StringgetDdd() {
return this.ddd;
    }

public StringgetNumero() {
return this.numero;
    }
}
```

Agora com o Record, todo esse código pode ser resumido com uma única linha:

```java
publicrecordTelefone(String ddd, String numero){}
```

Muito mais simples, não?!

Por baixo dos panos, o Java vai transformar esse Record em uma classe imutável, muito similar ao código exibido anteriormente.

## **Imutabilidade**

A imutabilidade, citada anteriormente ao falarmos sobre record, é um conceito importante em Java, que se refere à capacidade de um objeto não poder ser alterado depois de criado. Existem algumas classes que são imutáveis por padrão, como por exemplo, as classes String, Integer, Boolean, entre outras. Isso significa que, uma vez criado um objeto dessas classes, não é possível modificar o seu estado.

Vamos exemplificar. Dado o record abaixo:

```java
publicrecordEstudante(String nome, int idade) {}

```

Uma vez criado um objeto Estudante, seus valores não podem ser modificados:

```java
Estudante estudante1 =newEstudante(“Alice”, 19);
```

Observe que após essa criação, eu não consigo setar outro nome ou idade para o objeto estudante1.

```java
estudante1.setNome(“Maria”); //Essa possibilidade não existe
estudante1.nome = “Maria”; //Essa possibilidade não existe

```

Qualquer uma das tentativas acima, vai apresentar erro de compilação, pois não é possível atribuir nenhum outro nome a variável estudante1.

Com relação ao record, fica bem claro, certo? Mas e a String, por exemplo? Eu consigo fazer os passos abaixo no código:

```java
String nome = “Maria”;
nome = “Alice”;

```

Se a String é imutável, o certo era eu não conseguir atribuir o conteúdo “Alice” à variável nome, correto?

No caso da String e de outras classes imutáveis que citei acima, a variável `nome` contém uma referência ao objeto da classe String que contém o valor "Maria".

No entanto, quando você tenta alterar o valor da string, o que realmente acontece é que um novo objeto da classe String é criado com o novo valor e a variável é atualizada para armazenar uma referência ao novo objeto.

Por isso, podemos dizer que a classe String é imutável, porque uma vez que um objeto da classe String é criado, ele não pode ser alterado. No entanto, as variáveis que armazenam referências a objetos da classe String podem ser atualizadas para referenciar novos objetos, que são criados a partir do conteúdo do objeto original.

A imutabilidade é importante por várias razões, entre elas:

- `Concorrência`: objetos imutáveis são seguros para uso em ambientes concorrentes, já que não há necessidade de sincronização.
- `Segurança`: objetos imutáveis são seguros contra alterações acidentais ou mal-intencionadas.
- `Desempenho`: objetos imutáveis podem ser armazenados em cache e reutilizados, o que pode melhorar o desempenho.

---

### Annotations(Anotação Java)

As anotações, também conhecidas como annotations, são uma forma de adicionar configurações ao código Java de uma maneira bem simples. Elas são usadas para fornecer informações adicionais sobre o código, como o significado de uma classe, um método ou um atributo.

No Java, as anotações são definidas com o uso do símbolo "@" seguido do nome da anotação. Por exemplo, a anotação `@Deprecated` é usada para indicar que um método ou classe está obsoleto e não deve ser mais utilizado. Outra anotação muito útil é a `@Override`, conforme foi demonstrado no último vídeo, que indica que um método está sobrescrevendo o mesmo método definido na sua classe mãe.

- `@Override` → é utilizada em Java para indicar que um método está sendo sobrescrito na classe filha. Embora seja opcional, é uma boa prática utilizá-la, pois ela ajuda a evitar erros de digitação e a IDE pode exibir alertas caso haja algum problema na sobrescrita do método.
- `@Deprecated` → é usada para indicar que um método ou classe está obsoleto e não deve ser mais utilizado
- `@SerializedName` → é utilizada em classes Java para especificar o nome dos campos no JSON.