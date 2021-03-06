/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>subtitle</code>
  */
@js.annotation.ScalaJSDefined
class Subtitle extends js.Object {

  /**
    * The horizontal alignment of the subtitle. Can be one of "left", "center" and "right".
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/align/" target="_blank">Footnote at right of plot area</a>
    * @since 2.0
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * When the subtitle is floating, the plot area will not move to make space for it.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/floating/" target="_blank">Floating title and subtitle</a>.
    * @since 2.1
    */
  val floating: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>CSS styles for the title.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the subtitle style is given in the <code>.highcharts-subtitle</code> class.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/style/" target="_blank">Custom color and weight</a>.

<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/titles/" target="_blank">Styled mode</a>.
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The subtitle of the chart.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/text/" target="_blank">Custom subtitle</a>,
			<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/text-formatted/" target="_blank">formatted and linked text.</a>
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the text.
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * The vertical alignment of the title. Can be one of "top", "middle" and "bottom". When a value is given, the title behaves as floating.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/verticalalign/" target="_blank">Footnote at the bottom right of plot area</a>
    * @since 2.1
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * Adjustment made to the subtitle width, normally to reserve space for the exporting burger menu.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/widthadjust/" target="_blank">Wider menu, greater padding</a>
    * @since 4.2.5
    */
  val widthAdjust: js.UndefOr[Double] = js.undefined

  /**
    * The x position of the subtitle relative to the alignment within chart.spacingLeft and chart.spacingRight.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/align/" target="_blank">Footnote at right of plot area</a>
    * @since 2.0
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The y position of the subtitle relative to the alignment within chart.spacingTop and chart.spacingBottom. By default the subtitle is laid out below the title unless the title is floating.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/verticalalign/" target="_blank">Footnote at the bottom right of plot area</a>
    * @since 2.0
    */
  val y: js.UndefOr[Double] = js.undefined
}

object Subtitle {
  /**
    * @param align The horizontal alignment of the subtitle. Can be one of "left", "center" and "right".
    * @param floating When the subtitle is floating, the plot area will not move to make space for it.
    * @param style <p>CSS styles for the title.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the subtitle style is given in the <code>.highcharts-subtitle</code> class.</p>
    * @param text The subtitle of the chart.
    * @param useHTML Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the text.
    * @param verticalAlign The vertical alignment of the title. Can be one of "top", "middle" and "bottom". When a value is given, the title behaves as floating.
    * @param widthAdjust Adjustment made to the subtitle width, normally to reserve space for the exporting burger menu.
    * @param x The x position of the subtitle relative to the alignment within chart.spacingLeft and chart.spacingRight.
    * @param y The y position of the subtitle relative to the alignment within chart.spacingTop and chart.spacingBottom. By default the subtitle is laid out below the title unless the title is floating.
    */
  def apply(align: js.UndefOr[String] = js.undefined, floating: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, widthAdjust: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): Subtitle = {
    val alignOuter: js.UndefOr[String] = align
    val floatingOuter: js.UndefOr[Boolean] = floating
    val styleOuter: js.UndefOr[js.Object] = style
    val textOuter: js.UndefOr[String] = text
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val widthAdjustOuter: js.UndefOr[Double] = widthAdjust
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    new Subtitle {
      override val align: js.UndefOr[String] = alignOuter
      override val floating: js.UndefOr[Boolean] = floatingOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val text: js.UndefOr[String] = textOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val widthAdjust: js.UndefOr[Double] = widthAdjustOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    }
  }
}
