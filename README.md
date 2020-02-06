# venturus-test

Aplicação Android com Kotlin para aplicação à vaga de de Desenvolvedor Android na Venturus.

### Objetivos do teste

- [x] Implementar um app Android com Kotlin
- [x] Realizar uma requisição HTTP para a API do imgur
- [x] Mostrar numa galeria as imagens referentes aos links recebidos na requisição

### Bibliotecas utilizadas

###### Retrofit
Escolhida por facilitar a comunicação com api's, simplificando a configuração e a serialização e deserialização dos objetos
###### Glide
Escolhida por ser de fácil utilização para colocar imagens de um link em um ImageView.

### Dificuldades encontrdas

Foram encontradas algumas dificuldades principalmente na comunicação com a api do imgur. A principal foi a montagem do cabeçalho da requisição, em que era necessário enviar além do campo Authorization, o campo User-Agent. Pelas experiências anteriores com requisições HTTP, fora imaginadas algumas hipóteses possíveis para o problema, posteriormente, validando-as até alcançar a resolução da adversidade.
