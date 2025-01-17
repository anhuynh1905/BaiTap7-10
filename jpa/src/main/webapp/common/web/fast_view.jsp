<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!-- BEGIN fast view of a product -->
<div id="product-pop-up" style="display: none; width: 700px;">
	<div class="product-page product-pop-up">
		<div class="row">
			<div class="col-md-6 col-sm-6 col-xs-3">
				<div class="product-main-image">
					<img src="${URL}assets/frontend/pages/img/products/model7.jpg"
						alt="Cool green dress with red bell" class="img-responsive">
				</div>
				<div class="product-other-images">
					<a href="#" class="active"><img alt="Berry Lace Dress"
						src="${URL}assets/frontend/pages/img/products/model3.jpg"></a> <a
						href="#"><img alt="Berry Lace Dress"
						src="${URL}assets/frontend/pages/img/products/model4.jpg"></a> <a
						href="#"><img alt="Berry Lace Dress"
						src="${URL}assets/frontend/pages/img/products/model5.jpg"></a>
				</div>
			</div>
			<div class="col-md-6 col-sm-6 col-xs-9">
				<h2>Cool green dress with red bell</h2>
				<div class="price-availability-block clearfix">
					<div class="price">
						<strong><span>$</span>47.00</strong> <em>$<span>62.00</span></em>
					</div>
					<div class="availability">
						Availability: <strong>In Stock</strong>
					</div>
				</div>
				<div class="description">
					<p>Lorem ipsum dolor ut sit ame dolore adipiscing elit, sed
						nonumy nibh sed euismod laoreet dolore magna aliquarm erat
						volutpat Nostrud duis molestie at dolore.</p>
				</div>
				<div class="product-page-options">
					<div class="pull-left">
						<label class="control-label">Size:</label> <select
							class="form-control input-sm">
							<option>L</option>
							<option>M</option>
							<option>XL</option>
						</select>
					</div>
					<div class="pull-left">
						<label class="control-label">Color:</label> <select
							class="form-control input-sm">
							<option>Red</option>
							<option>Blue</option>
							<option>Black</option>
						</select>
					</div>
				</div>
				<div class="product-page-cart">
					<div class="product-quantity">
						<input id="product-quantity" type="text" value="1" readonly
							name="product-quantity" class="form-control input-sm">
					</div>
					<button class="btn btn-primary" type="submit">Add to cart</button>
					<a href="shop-item.html" class="btn btn-default">More details</a>
				</div>
			</div>

			<div class="sticker sticker-sale"></div>
		</div>
	</div>
</div>
<!-- END fast view of a product -->