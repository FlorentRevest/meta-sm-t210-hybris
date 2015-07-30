require recipes-kernel/linux/linux.inc

SECTION = "kernel"
COMPATIBLE_MACHINE = "sm-t210"

DESCRIPTION = "Linux kernel for the Samsung SM-T210 device based on the offical \
source from Samsung"

KERNEL_RAM_BASE = "0x10008000"
RAMDISK_RAM_BASE = "0x11000000"
SECOND_RAM_BASE = "0x10f00000"
TAGS_RAM_BASE = "0x10000100"

CMDLINE = "initrd=0x01100000,1m rw panic_debug uart_dma vmalloc=0x10000000 qhd_lcd=1 crashkernel=4k@0x8200000 ioncarv=112M@0x09000000 reserve_gpu=16M atcmdmode=1 androidboot.emmc_checksum=3 androidboot.serialno=4100aec49463a000 board_id=0x05 panel_id=0x00000002 disp_start_addr=0x17000000 ddr_mode=1 androidboot.debug_level=0x4f4c cordon=dffb8496d0da7dac599d7749adf9006c version=Sbl(1.0.0) 2014-09-04 19:44:23 enable_adb=1"

inherit kernel_android

SRC_URI = " \
  git://github.com/gr8nole/android_kernel_samsung_lt02;protocol=https;branch=master \
  file://defconfig \
"
SRCREV = "2c3a46f2f81aef18758c93297858d689d4d3c4bd"

S = "${WORKDIR}/git"
PV = "3.4.5"
