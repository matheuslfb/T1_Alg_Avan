# Trabalho 1 - Algoritmos Avançados<br>
Prof. Diego Noble<br>
28 de março de 2018 <br>
Instruções: O trabalho é individual e deve ser entregue conforme a data
limite estabelecida na sala de entrega do Moodle da disciplina. Trabalhos
em atraso não serão avaliados. Junto com um relatório de, no máximo, de
duas páginas, você deverá anexar todos os códigos-fonte desenvolvidos. A
linguagem de programação é de livre escolha. Testes unitários e comentários
no código serão avaliados positivamente. <br>O código-fonte não deve depender
do ambiente de programação (IDE, sistema operacional, arquitetura, etc) e
deve executar e resolver o problema sem qualquer alteração.<br>
Um intervalo é definido por um par (ts, tf) onde ts é o tempo de ínicio
e tf é o tempo final, ambos valores inteiros. Dois ou mais intervalos estão
em conflito se else se sobrepõem em algum momento. Dado um conjunto
de intervalos, o problema do escalonamento consiste em encontrar o maior
subconjunto de intervalos não-conflitantes.
Considerando o problema do escalonamento de intervalos descrito acima:
1. Desenvolva um gerador aleatório de intervalos. Use uma distribuição
uniforme para escolher os tempos iniciais e finais. Certifique-se de que
para todo o intervalo i gerado tsi < tfi
.
2. Use o gerador para criar 10 conjuntos com 106
intervalos cada tal que
o tf de cada intervalo não exceda 1000.
3. Escolha e implemente uma estratégia gulosa sub-ótima e a estratégia
gulosa ótima.
4. Compare os dois algoritmos nos 10 conjuntos de intervalos criados. A
comparação pode ser feita através da média e do desvio padrão de cada
execução.
