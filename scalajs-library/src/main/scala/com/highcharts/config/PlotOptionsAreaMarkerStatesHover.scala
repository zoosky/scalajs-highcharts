/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.0 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class PlotOptionsAreaMarkerStatesHover extends js.Object {
  
  /**
   * Enable or disable the point marker.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-enabled/" target="_blank">Disabled hover state</a>
   */
  var enabled: Boolean = true
  
  /**
   * The fill color of the marker in hover state.
   */
  var fillColor: String = ""
  
  /**
   * The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-linecolor/" target="_blank">White fill color, black line color</a>
   */
  var lineColor: String = "#FFFFFF"
  
  /**
   * The width of the point marker's outline.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-linewidth/" target="_blank">3px line width</a>
   */
  var lineWidth: Double = 0
  
  /**
   * The additional line width for a hovered point.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/" target="_blank">2 pixels wider on hover</a>
   * @since 4.0.3
   */
  var lineWidthPlus: Double = 1
  
  /**
   * The radius of the point marker. In hover state, it defaults to the normal state's radius + 2 as per the <a href="#plotOptions.series.marker.states.hover.radiusPlus">radiusPlus</a> option.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-radius/" target="_blank">10px radius</a>
   */
  var radius: UndefOr[Double] = js.undefined
  
  /**
   * The number of pixels to increase the radius of the hovered point.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/" target="_blank">5 pixels greater radius on hover</a>
   * @since 4.0.3
   */
  var radiusPlus: Double = 2
}
