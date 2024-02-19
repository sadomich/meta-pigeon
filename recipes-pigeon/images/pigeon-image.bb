DESCRIPTION = "Pigeon image"
LICENSE = "MIT"

include recipes-core/images/core-image-base.bb

IMAGE_FSTYPES:remove= " wic.bz2"
IMAGE_FSTYPES:append = " wic.xz"

inherit extrausers

EXTRA_USERS_PARAMS = "usermod -p '\$6\$cuQ1gdYn97cw\$oUxe0sNNIcbGBpKGx6xr6anUBfrt2yrg04.f21DqZfdt6ENWp1/725zyuyFBVfrSA4VDRzFy/walyFbqx.i8X0' root; \
			useradd --create-home --system -p '\$6\$G6j/OfHNSTlNSYpo\$oO2WgDv0LFnts8WaSGU9WjnbSm/i9AifKwl2VMWdlMzsoSroiyDk.R.gJLDFfow/MlCAoa3MGkNgCiMMvafrC0' pi;"

IMAGE_INSTALL += " openssh \
	openssl \
	openssh-sftp-server \
	vim bash kernel-modules \
	bcm2835-tests \
	raspi-gpio \
	rpio \
	rpi-gpio \
	pi-blaster \
	tzdata \
	watchdog \
	libgpiod \
	can-utils \
	libftdi \
	i2c-tools \
	owfs \
	resize-data-part \
	net-config \
	"

IMAGE_FEATURE:remove = "splash"

IMAGE_FEATURES += "package-management"
