# Jogo das Palavras

O jogo deve possuir os seguintes componentes com as seguintes responsabilidades:

- **Principal**: representa a classe com o método main(). É essa classe que é responsável por ler
a entrada do usuário e por imprimir as informações no console. Nenhuma outra classe pode
imprimir ou ler do console.
- **BancoDePalavras**: classe que possui um método que retorna uma palavra retirada
aleatóriamente de uma lista de palavras lida a partir de um arquivo.
- **Embaralhador**: interface que representa classes reponsáveis por receber uma palavra e
retornar ela embaralhada. Pelo menos duas implementações deverão ser feitas.
- **FabricaEmbaralhadores**: possui um método que retorna um embaralhador
aleatóriamente.
- **MecanicaDoJogo**: interface que representa o andamento e a lógica do jogo. É responsável
por ditar o andamento do jogo. Ela que vai dizer se o jogo acabou ou não, se o usuário acertou a
palavra ou não, se o usuário pode tentar acertar a palavra novamente e qual foi a pontuação final
do jogador. Pelo menos duas implementações dessa interface devem ser criadas.
- **FabricaMecanicaDoJogo**: retorna a MecanicaDoJogo que deve ser utilizada.