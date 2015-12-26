/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.8 by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>yAxis-stackLabels</code>
  */
@js.annotation.ScalaJSDefined
class YAxisStackLabels extends js.Object {

  /**
    * Defines the horizontal alignment of the stack total label.  Can be one of <code>"left"</code>, <code>"center"</code> or <code>"right"</code>. The default value is calculated at runtime and depends on orientation and whether  the stack is positive or negative.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/stacklabels-align-left/" target="_blank">aligned to the left</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/stacklabels-align-center/" target="_blank">aligned in center</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/stacklabels-align-right/" target="_blank">aligned to the right</a>
    * @since 2.1.5
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * Enable or disable the stack total labels.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/stacklabels-enabled/" target="_blank">Enabled stack total labels</a>
    * @since 2.1.5
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * A <a href="http://docs.highcharts.com/#formatting">format string</a> for the data label. Available variables are the same as for <code>formatter</code>.
    * @since 3.0.2
    */
  val format: js.UndefOr[String] = js.undefined

  /**
    * Callback JavaScript function to format the label. The value is  given by <code>this.total</code>. Defaults to: 
    * <pre>function() {
    * 	return this.total;
    * }</pre>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/stacklabels-formatter/" target="_blank">Added units to stack total value</a>
    * @since 2.1.5
    */
  val formatter: js.UndefOr[js.Function] = js.undefined

  /**
    * Rotation of the labels in degrees.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/stacklabels-rotation/" target="_blank">Labels rotated 45°</a>
    * @since 2.1.5
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * CSS styles for the label.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/stacklabels-style/" target="_blank">Red stack total labels</a>
    * @since 2.1.5
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The text alignment for the label. While <code>align</code> determines where the texts anchor point is placed with regards to the stack, <code>textAlign</code> determines how the text is aligned against its anchor point. Possible values are <code>"left"</code>, <code>"center"</code> and <code>"right"</code>. The default value is calculated at runtime and depends on orientation and whether the stack is positive or negative.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/stacklabels-textalign-left/" target="_blank">Label in center position but text-aligned left</a>
    * @since 2.1.5
    */
  val textAlign: js.UndefOr[String] = js.undefined

  /**
    * Whether to <a href="http://docs.highcharts.com/#formatting$html">use HTML</a> to render the labels.
    * @since 3.0
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * Defines the vertical alignment of the stack total label. Can be one of <code>"top"</code>, <code>"middle"</code> or <code>"bottom"</code>. The default value is calculated at runtime and depends on orientation and whether  the stack is positive or negative.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/stacklabels-verticalalign-top/" target="_blank">"Vertically aligned top"</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/stacklabels-verticalalign-middle/" target="_blank">"Vertically aligned middle"</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/stacklabels-verticalalign-bottom/" target="_blank">"Vertically aligned bottom"</a>
    * @since 2.1.5
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * The x position offset of the label relative to the left of the stacked bar. The default value is calculated at runtime and depends on orientation and whether the stack is positive or negative.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/stacklabels-x/" target="_blank">Stack total labels with x offset</a>
    * @since 2.1.5
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The y position offset of the label relative to the tick position on the axis. The default value is calculated at runtime and depends on orientation and whether  the stack is positive or negative.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/stacklabels-y/" target="_blank">Stack total labels with y offset</a>
    * @since 2.1.5
    */
  val y: js.UndefOr[Double] = js.undefined
}
