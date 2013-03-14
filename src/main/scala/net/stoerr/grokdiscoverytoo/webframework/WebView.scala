package net.stoerr.grokdiscoverytoo.webframework

import javax.servlet.http.HttpServletRequest
import xml.NodeSeq

/**
 * Basis for a View-Class that displays a page.
 * @author <a href="http://www.stoerr.net/">Hans-Peter Stoerr</a>
 * @since 15.02.13
 */
trait WebView {

  val request: HttpServletRequest

  val title: String

  /** action of the form, e.g. "/web/match" */
  val action: String

  /** If this returns something, we will use the returned view. */
  def doforward: Option[Either[String, WebView]] = None

  def inputform: NodeSeq

  def navigation: NodeSeq = <a class="ym-button ym-next" href="#">Read More</a> ++
    <a class="ym-button ym-next" href="#">Read More</a>

  def result: NodeSeq

  def body: NodeSeq =
    <h4>
      {title}
    </h4> <form class="ym-form ym-full" action={action} method="post">
      {inputform}
    </form> ++ result


}