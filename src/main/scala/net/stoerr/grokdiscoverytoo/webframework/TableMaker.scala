package net.stoerr.grokdiscoverytoo.webframework

import xml.{Node, Text, NodeSeq}

/**
 * Some helper functions to create tables
 * @author <a href="http://www.stoerr.net/">Hans-Peter Stoerr</a>
 * @since 28.02.13
 */
object TableMaker {

  implicit def stringToNode(str: String): Node = new Text(str)

  def table(contents: () => NodeSeq): Node = <table class="bordertable narrow">
    {contents}
  </table>

  def warn(content: NodeSeq) =
    <div class="ym-fbox-text ym-error">
      <p class="ym-message">
        {content}
      </p>
    </div>

  def row(content: NodeSeq) = <tr>
    <td>
      {content}
    </td>
  </tr>

  def rowheader(content: NodeSeq) = <tr>
    <th>
      {content}
    </th>
  </tr>

  def row2(content1: NodeSeq, content2: NodeSeq) = <tr>
    <td>
      {content1}
    </td> <td>
      {content2}
    </td>
  </tr>

  def row2(content: NodeSeq) = <tr>
    <td colspan="2">
      {content}
    </td>
  </tr>

  def rowheader2(content1: NodeSeq, content2: NodeSeq) = <tr>
    <th>
      {content1}
    </th> <th>
      {content2}
    </th>
  </tr>

  def rowheader2(content: NodeSeq) = <tr>
    <th colspan="2">
      {content}
    </th>
  </tr>

}