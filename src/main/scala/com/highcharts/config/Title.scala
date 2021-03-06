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
  * @note JavaScript name: <code>title</code>
  */
@js.annotation.ScalaJSDefined
class Title extends js.Object {

  /**
    * The horizontal alignment of the title. Can be one of "left", "center" and "right".
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/align/" target="_blank">Aligned to the plot area (x = 70px 
			= margin left - spacing left)</a>
    * @since 2.0
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * When the title is floating, the plot area will not move to make space for it.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/zoomtype-none/" target="_blank">False by default</a>,
			<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/floating/" target="_blank">true - title on top of the plot area</a>.
    * @since 2.1
    */
  val floating: js.UndefOr[Boolean] = js.undefined

  /**
    * The margin between the title and the plot area, or if a subtitle is present, the margin between the subtitle and the plot area.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/margin-50/" target="_blank">A chart title margin of 50</a>,
			<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/margin-subtitle/" target="_blank">the same margin applied with a subtitle</a>.
    * @since 2.1
    */
  val margin: js.UndefOr[Double] = js.undefined

  /**
    * <p>CSS styles for the title. Use this for font styling, but use <code>align</code>, <code>x</code> and <code>y</code> for text alignment.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the title style is given in the <code>.highcharts-title</code> class.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/style/" target="_blank">Custom color and weight</a>.

<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/titles/" target="_blank">Styled mode</a>.
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The title of the chart. To disable the title, set the <code>text</code> to <code>null</code>.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/text/" target="_blank">Custom title</a>
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the text.
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * The vertical alignment of the title. Can be one of <code>"top"</code>, <code>"middle"</code> and <code>"bottom"</code>. When a value is given, the title behaves as if <a href="#title.floating">floating</a> were <code>true</code>.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/verticalalign/" target="_blank">Chart title in bottom right corner</a>
    * @since 2.1
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * Adjustment made to the title width, normally to reserve space for the exporting burger menu.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/widthadjust/" target="_blank">Wider menu, greater padding</a>
    * @since 4.2.5
    */
  val widthAdjust: js.UndefOr[Double] = js.undefined

  /**
    * The x position of the title relative to the alignment within chart.spacingLeft and chart.spacingRight.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/align/" target="_blank">Aligned to the plot area (x = 70px 
			= margin left - spacing left)</a>
    * @since 2.0
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The y position of the title relative to the alignment within <a href="#chart.spacingTop">chart.spacingTop</a> and <a href="#chart.spacingBottom">chart.spacingBottom</a>. By default it depends on the font size.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/y/" target="_blank">Title inside the plot area</a>
    * @since 2.0
    */
  val y: js.UndefOr[Double] = js.undefined
}

object Title {
  /**
    * @param align The horizontal alignment of the title. Can be one of "left", "center" and "right".
    * @param floating When the title is floating, the plot area will not move to make space for it.
    * @param margin The margin between the title and the plot area, or if a subtitle is present, the margin between the subtitle and the plot area.
    * @param style <p>CSS styles for the title. Use this for font styling, but use <code>align</code>, <code>x</code> and <code>y</code> for text alignment.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the title style is given in the <code>.highcharts-title</code> class.</p>
    * @param text The title of the chart. To disable the title, set the <code>text</code> to <code>null</code>.
    * @param useHTML Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the text.
    * @param verticalAlign The vertical alignment of the title. Can be one of <code>"top"</code>, <code>"middle"</code> and <code>"bottom"</code>. When a value is given, the title behaves as if <a href="#title.floating">floating</a> were <code>true</code>.
    * @param widthAdjust Adjustment made to the title width, normally to reserve space for the exporting burger menu.
    * @param x The x position of the title relative to the alignment within chart.spacingLeft and chart.spacingRight.
    * @param y The y position of the title relative to the alignment within <a href="#chart.spacingTop">chart.spacingTop</a> and <a href="#chart.spacingBottom">chart.spacingBottom</a>. By default it depends on the font size.
    */
  def apply(align: js.UndefOr[String] = js.undefined, floating: js.UndefOr[Boolean] = js.undefined, margin: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, widthAdjust: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): Title = {
    val alignOuter: js.UndefOr[String] = align
    val floatingOuter: js.UndefOr[Boolean] = floating
    val marginOuter: js.UndefOr[Double] = margin
    val styleOuter: js.UndefOr[js.Object] = style
    val textOuter: js.UndefOr[String] = text
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val widthAdjustOuter: js.UndefOr[Double] = widthAdjust
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    new Title {
      override val align: js.UndefOr[String] = alignOuter
      override val floating: js.UndefOr[Boolean] = floatingOuter
      override val margin: js.UndefOr[Double] = marginOuter
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
