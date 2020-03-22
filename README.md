# CALCULATOR OOP
Simple GUI-ed calculator with Object oriented Programming

## Contributors
- 13518011	/ Muhammad Rahadian Alamsyah Putra Winarno
- 13518086	/ Jones Napoleon Autumn
- 13518104	/ Kevin Austin Stefano
- 13518122	/ Stefanus Stanley Yoga Setiawan

## Description
Aplikasi kalkulator sederhana berbasis orientasi objek yang mampu melakukan beberapa task sederhana.\
Yang pertama adalah menampilkan angka, titik (**.**) sebagai decimal separator, dan operator matematika ke layar.\
Operator matematika dalam hal ini berupa  penjumlahan (**+**), pengurangan (**-**), perkalian (**x**), pembagian (**:**), akar (**√**), trigonometri (**sin, cos, tan**), pemangkatan (**^**).

Fitur pada program kami:\
Program kami juga telah mendukung spesialisasi prioritas pengerjaan (memprioritaskan operator yang harus didahulukan, seperti kali, bagi, dan sebagainya).\
Selanjutnya program kami mampu menampilkan hasil kalkulasi setelah diklik tombol sama dengan (**=**).\
Tidak lupa kami juga menampilkan pesan kesalahan untuk kesalahan sintaks dan pengerjaan tidak valid untuk bilangan dan operator (contohnya: √bilangan negatif, x/0, 5++3, 51..3).\
Selain tombol angkat dan operator, program kami juga menyediakan tombol **Ans**, **MC**, **MR**, **AC** (Clear), dan **<-** (Undo)  sesuai dengan spesifikasi selayaknya.

## Prerequisite
- Processing 3.5.3

## How to run
- Buka main.pde (pastikan processing sudah terinstall)
- Drag libray.jar files dari folder bin ke dalam main.pde
- Secara otomatis, processing akan membuatkan folder code, di mana itu adalah library yang diimport ke dalam processing
- Pilih tombol run, program akan langsung berjalan

## Code Structure
<b>Calculator</b>
<details>
  <summary>main</summary>
  <ul>
    <li>main.pde</li>
    <li>calculator-logos.jpg</li>
  </ul>
</details>
<details>
  <summary>src</summary>
  <ul>
    <details>
      <summary>button</summary>
      <ul>
        <li><b>specialButton</b></li>
        <ul>
          <li>AnsButton.java</li>
          <li>ClearButton.java</li>
          <li>Equal.java</li>
          <li>MCButton.java</li>
          <li>MRButton.java</li>
          <li>SpecialButton.java</li>
          <li>UndoButton.java</li>
        </ul>
        <li>Button.java</li>
        <li>Number.java</li>
        <li>Operator.java</li>
      </ul>
    </details>
    <details>
      <summary>calculate</summary>
      <ul>
        <li>Calculate.java</li>
      </ul>
    </details>
    <details>
      <summary>checker</summary>
      <ul>
        <li>AnsAnsChecker.java</li>
        <li>CheckAll.java</li>
        <li>Checker.java</li>
        <li>DoubleDotChecker.java</li>
        <li>MinusMinusChecker.java</li>
        <li>NumberRootChecker.java</li>
        <li>OperatorOperatorChecker.java</li>
        <li>RootOperatorChecker.java</li>
        <li>TrigonomChecker.java</li>
      </ul>
    </details>
    <details>
      <summary>exception</summary>
      <ul>
        <li>AnsAnsException.java</li>
        <li>DivideByZeroException.java</li>
        <li>DoubleDotException.java</li>
        <li>EndOperandException.java</li>
        <li>NoAnsException.java</li>
        <li>NumberRootException.java</li>
        <li>OperatorOperatorException.java</li>
        <li>RootMinusException.java</li>
        <li>StartOperandException.java</li>
        <li>TrigonoOperatorException.java</li>
      </ul>
    </details>
    <details>
      <summary>expression</summary>
      <ul>
        <li>Expression.java</li>
        <li>TerminalExpression.java</li>
        <li><b>binary</b></li>
        <ul>
          <li>AddExpression.java</li>
          <li>BinaryExpression.java</li>
          <li>DivideExpression.java</li>
          <li>MultiplyExpression.java</li>
          <li>PowerExpression.java</li>
          <li>SubstractExpression.java</li>
        </ul>
        <li><b>unary</b></li>
        <ul>
          <li>CosExpression.java</li>
          <li>NegativeExpression.java</li>
          <li>RootExpression.java</li>
          <li>SinExpression.java</li>
          <li>TanExpression.java</li>
          <li>UnaryExpression.java</li>
        </ul>
      </ul>
    </details>
    <details>
      <summary>parser</summary>
      <ul>
        <li>Parser.java</li>
      </ul>
    </details>
    <details>
      <summary>screen</summary>
      <ul>
        <li>Screen.java</li>
      </ul>
    </details>
    <details>
      <summary>solver</summary>
      <ul>
        <li>AddSubSolver.java</li>
        <li>AnsSolver.java</li>
        <li>MultiDivSolver.java</li>
        <li>NegativeSolver.java</li>
        <li>PowSolver.java</li>
        <li>RootSolver.java</li>
        <li>Solver.java</li>
        <li>TrigonoSolver.java</li>
      </ul>
    </details>
  </ul>
</details>
<details>
  <summary>bin</summary>
  <ul><i>The class compilation result from src</i></ul>
</details>
<details>
  <summary>test</summary>
  <ul>
    <li><b>expression</b></li>
    <li><b>parser</b></li>
    <li><b>solver</b></li>
  </ul>  
</details>

