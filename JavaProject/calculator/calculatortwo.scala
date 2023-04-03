package calculator

import javax.swing._
import java.awt._
import java.awt.event._

object calculatortwo {
  def main(args: Array[String]): Unit = {
    val calc = new calculator
  }
}

class calculator  extends ActionListener {
  frame = new JFrame("Calculator")
  frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)
  frame.setSize(420, 550)
  frame.setLayout(null)
  textfield = new JTextField
  textfield.setBounds(50, 25, 300, 50)
  textfield.setFont(myFont)
  textfield.setEditable(false)
  addButton = new JButton("+")
  subButton = new JButton("-")
  mulButton = new JButton("*")
  divButton = new JButton("/")
  decButton = new JButton(".")
  equButton = new JButton("=")
  delButton = new JButton("Del")
  clrButton = new JButton("Clr")
  negButton = new JButton("(-)")
  functionButtons(0) = addButton
  functionButtons(1) = subButton
  functionButtons(2) = mulButton
  functionButtons(3) = divButton
  functionButtons(4) = decButton
  functionButtons(5) = equButton
  functionButtons(6) = delButton
  functionButtons(7) = clrButton
  functionButtons(8) = negButton
  for (i <- 0 until 9) {
    functionButtons(i).addActionListener(this)
    functionButtons(i).setFont(myFont)
    functionButtons(i).setFocusable(false)
  }
  for (i <- 0 until 10) {
    numberButtons(i) = new JButton(String.valueOf(i))
    numberButtons(i).addActionListener(this)
    numberButtons(i).setFont(myFont)
    numberButtons(i).setFocusable(false)
  }
  negButton.setBounds(50, 430, 100, 50)
  delButton.setBounds(150, 430, 100, 50)
  clrButton.setBounds(250, 430, 100, 50)
  panel = new JPanel
  panel.setBounds(50, 100, 300, 300)
  panel.setLayout(new GridLayout(4, 4, 10, 10))
  panel.add(numberButtons(1))
  panel.add(numberButtons(2))
  panel.add(numberButtons(3))
  panel.add(addButton)
  panel.add(numberButtons(4))
  panel.add(numberButtons(5))
  panel.add(numberButtons(6))
  panel.add(subButton)
  panel.add(numberButtons(7))
  panel.add(numberButtons(8))
  panel.add(numberButtons(9))
  panel.add(mulButton)
  panel.add(decButton)
  panel.add(numberButtons(0))
  panel.add(equButton)
  panel.add(divButton)
  frame.add(panel)
  frame.add(negButton)
  frame.add(delButton)
  frame.add(clrButton)
  frame.add(textfield)
  frame.setVisible(true)
  private[calculator] var frame: JFrame = null
  private[calculator] var textfield: JTextField = null
  private[calculator] val numberButtons = new Array[JButton](10)
  private[calculator] val functionButtons = new Array[JButton](9)
  private[calculator] var addButton: JButton = null
  private[calculator] var subButton: JButton = null
  private[calculator] var mulButton: JButton = null
  private[calculator] var divButton: JButton = null
  private[calculator] var decButton: JButton = null
  private[calculator] var equButton: JButton = null
  private[calculator] var delButton: JButton = null
  private[calculator] var clrButton: JButton = null
  private[calculator] var negButton: JButton = null
  private[calculator] var panel: JPanel = null
  private[calculator] val myFont = new Font("Ink Free", Font.BOLD, 30)
  private[calculator] var num1 = 0
  private[calculator] var num2 = 0
  private[calculator] var result = 0
  private[calculator] var operator = 0

  override def actionPerformed(e: ActionEvent): Unit = {
    for (i <- 0 until 10) {
      if (e.getSource eq numberButtons(i)) textfield.setText(textfield.getText.concat(String.valueOf(i)))
    }
    if (e.getSource eq decButton) textfield.setText(textfield.getText.concat("."))
    if (e.getSource eq addButton) {
      num1 = textfield.getText.toInt
      operator = '+'
      textfield.setText("")
    }
    if (e.getSource eq subButton) {
      num1 = textfield.getText.toInt
      operator = '-'
      textfield.setText("")
    }
    if (e.getSource eq mulButton) {
      num1 = textfield.getText.toInt
      operator = '*'
      textfield.setText("")
    }
    if (e.getSource eq divButton) {
      num1 = textfield.getText.toInt
      operator = '/'
      textfield.setText("")
    }
    if (e.getSource eq equButton) {
      num2 = textfield.getText.toInt
      operator match {
        case '+' =>
          result = num1 + num2
        case '-' =>
          result = num1 - num2
        case '*' =>
          result = num1 * num2
        case '/' =>
          result = num1 / num2
      }
      textfield.setText(String.valueOf(result))
      num1 = result
    }
    if (e.getSource eq clrButton) textfield.setText("")
    if (e.getSource eq delButton) {
      val string = textfield.getText
      textfield.setText("")
      for (i <- 0 until string.length - 1) {
        textfield.setText(textfield.getText + string.charAt(i))
      }
    }
    if (e.getSource eq negButton) {
      var temp = textfield.getText.toDouble
      temp *= -1
      textfield.setText(String.valueOf(temp))
    }
  }
}