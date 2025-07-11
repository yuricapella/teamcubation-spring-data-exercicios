Exercício teórico
https://forms.gle/by55eqkYwze2c6Gb7

---

Exercícios Práticos pra Fixação:
1. Crie uma exceção qualquer que extenda de Exception. Será uma exceção checada.
- Em algum método X, lance essa exception com "throw new SuaException()".
- Verifique que o compilador te obrigará a tratar com try-catch ou lançar na assinatura do método.
- Lance na assinatura do método X, e em um outro método Y, chame o método X.
- Verifique que o compilador novamente te obrigará a tratar a exceção checada.
- Verifique que o compilador identifica a propagação das exceções checadas até que seja tratada com try-catch.
---
2. Crie uma exceção qualquer que extenda de RuntimeException. Será uma exceção não-checada.
- Em algum método X, lance essa exception com "throw new SuaException()".
- Verifique que o compilador NÃO te obrigará a tratar essa exceção.
- Verifique que o compilador NÃO identifica a propagação das exceções não-checadas.
---
3. Crie um try-catch-finally (CENÁRIO SEM EXCEPTION)
   . No TRY, coloque um print, depois uma instrução que NÃO lança exception, e depois um outro print
   . No CATCH e no FINNALY, coloque um print em cada
   . Verifique que o TRY e o FINNALY serão executados completamente
---
4. Crie um try-catch-finally (CENÁRIO COM EXCEPTION)
   . No TRY, coloque um print, depois uma instrução que lança exception, e depois um outro print
   . No CATCH e no FINNALY, coloque um print em cada
   . Verifique que o TRY será executado apenas até a exception, e o CATCH e o FINNALY serão executados completamente
---
   --
   Exercícios Práticos no Projeto:
1. Utilize o ResponseStatusException para lançar exceção nos pontos onde a documentação solicita que retorne erros 4xx.
