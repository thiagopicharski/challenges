# Interview Challenge - Java

### Solve the problem presented below
**Problema da escrita do celular**

Uma das formas pelas quais se pode escrever letras utilizando teclas numéricas de um celular, é pressiona-las repetidas vezes até que a letra correspondente seja exibida.
Os fabricantes geralmente usam a seguinte associação tecla numérica/letras:

|Tecla|Letras associadas|
|-----|-----------------|
|2    |a,b,c            |
|3    |d,e,f            |
|4    |g,h,i            |
|5    |j,k,l            |
|6    |m,n,o            |
|7    |p,q,r,s          |
|8    |t,u,v            |
|9    |w,x,y,z          |
  
Por exemplo, para se obter a letra 'b' deve-se pressionar duas vezes a tecla 2, para a letra 'm' uma vez a tecla 6 e assim por diante.
Faça um programa que, recebendo uma palavra P (máximo de 50 caracteres), seja capaz de informar quantas vezes e quais teclas terão que ser
pressionadas para obtenção da palavra.
As teclas devem ser informadas na ordem para a formação correta da palavra.
Conforme o exemplo abaixo, cada tecla deve ser precedida por um cerquilha (#).
A quantidade de vezes deve vir logo em seguida à tecla separada por um igual (=) conforme exemplo.

#### Exemplo
Entrada:
```
internet
```
Saída:
```  
#4=3  
#6=2  
#8=1  
#3=2  
#7=3  
#6=2  
#3=2  
#8=1
```  

### Acceptance criteria

Source Code available:
- We should be able to access the code with your solution
- We should be able to compile and run your code
- You should implement your code in the class Solution.java in the package com.unify.ta.interview
- The class Solution.java should implement the interface com.unify.ta.interview.ISolution
- The class Solution.java should be able to be initialized with no parameters (ex. new Solution())
- The class Solution.java should apply the annotation @Component from org.springframework.stereotype
- You can use the JUnit test com.unify.ta.interview.SolutionTest to validate your code

Running your code:
- Should pass in all automated tests that we run
- Should use the exact pattern proposed for input and output
- Use this reference project that is on Maven. We are going to run the command below to test your code:

  *mvn test*

### Notes
1. Use Java 8 or above to develop your solution
2. Create a fork of this repository as described below

## Push your changes for evaluation
1. Create a fork of this repository
2. Make your changes, commit and push them
3. Inform us which is the fork you have created

