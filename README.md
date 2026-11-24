# App Services (Java)

> Repositório didático: exercício prático de Android nativo com **Java**, desenvolvido e aplicado em sala de aula pelo Prof. Fabricio Curvello.

## Sobre o projeto

Aplicativo que inicia e para um **Service** que roda em segundo plano.

## Contexto acadêmico

Exercício aplicado em sala de aula, usado como prática guiada com os alunos.

## Versão em Kotlin

Esta mesma aplicação também foi desenvolvida em **Kotlin**: [AppServicesKotlin](https://github.com/fabcurvello/AppServicesKotlin). Comparar as duas versões lado a lado ajuda a entender as diferenças de sintaxe entre Java e Kotlin no Android.

## O que o app faz

- Botões **Iniciar serviço** e **Parar serviço**.
- Enquanto está ativo, o `MyService` mostra um `Toast` e registra no Logcat a cada 3 segundos que está em execução.
- Ao ser parado, avisa que o serviço foi encerrado.

## Conceitos trabalhados em aula

- **Services** no Android: `startService` / `stopService`
- Ciclo de vida do Service (`onCreate`, `onStartCommand`, `onDestroy`)
- `START_STICKY`
- Tarefas repetidas com `Handler` e `Runnable`
- Declaração do service no `AndroidManifest.xml`

## Tecnologias

- **Java**
- **Android SDK** (Android Studio)
- **Gradle**
- `minSdk 28` / `compileSdk 34`

## Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/fabcurvello/AppServicesJava.git
   ```
2. Abra a pasta no **Android Studio** e aguarde a sincronização do Gradle.
3. Execute em um emulador ou dispositivo físico com Android compatível com a API 28 ou superior.

## Veja também

Outros repositórios de aula com o mesmo tema:

- [AppServicesKotlin](https://github.com/fabcurvello/AppServicesKotlin)
- [AppRemoteProcedureCallsBinderJava](https://github.com/fabcurvello/AppRemoteProcedureCallsBinderJava)
- [AppRemoteProcedureCallsBinderKotlin](https://github.com/fabcurvello/AppRemoteProcedureCallsBinderKotlin)
- [AppThreadJava](https://github.com/fabcurvello/AppThreadJava)
- [AppThreadKotlin](https://github.com/fabcurvello/AppThreadKotlin)

## Autor

**Fabricio Curvello**: professor de desenvolvimento de software no SENAI-RJ (desde 1997) e em faculdades do grupo Ânima Educação (IBMR e UNA).

- GitHub: [github.com/fabcurvello](https://github.com/fabcurvello)
- LinkedIn: [linkedin.com/in/fabriciocurvello](https://www.linkedin.com/in/fabriciocurvello)
- YouTube: [@fabriciocurvello](https://www.youtube.com/@fabriciocurvello)
