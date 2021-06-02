<?php
/**
 * The base configuration for WordPress
 *
 * The wp-config.php creation script uses this file during the
 * installation. You don't have to use the web site, you can
 * copy this file to "wp-config.php" and fill in the values.
 *
 * This file contains the following configurations:
 *
 * * MySQL settings
 * * Secret keys
 * * Database table prefix
 * * ABSPATH
 *
 * @link https://codex.wordpress.org/Editing_wp-config.php
 *
 * @package WordPress
 */

// ** MySQL settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define( 'DB_NAME', 'wordpress' );

/** MySQL database username */
define( 'DB_USER', 'root' );

/** MySQL database password */
define( 'DB_PASSWORD', '' );

/** MySQL hostname */
define( 'DB_HOST', 'localhost' );

/** Database Charset to use in creating database tables. */
define( 'DB_CHARSET', 'utf8mb4' );

/** The Database Collate type. Don't change this if in doubt. */
define( 'DB_COLLATE', '' );

/** La memoria */
define('WP_MEMORY_LIMIT', '128M');

/**#@+
 * Authentication Unique Keys and Salts.
 *
 * Change these to different unique phrases!
 * You can generate these using the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}
 * You can change these at any point in time to invalidate all existing cookies. This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define( 'AUTH_KEY',         'z)aP3[22Z}O&yVskg,}@&LHkJcwlbPXI?8bJ%!zOfbW/y#apah9QR~UC,qsz27Vg' );
define( 'SECURE_AUTH_KEY',  '/35*@?ld[pih:~ iLXDB$9x@C++hI]fpfp3;6f/@W|1sU,]3EWO3|5s^s[F14vel' );
define( 'LOGGED_IN_KEY',    '|SUyQFr%=X)1i~kEQ[< 1P;RR};uS}w~Xu0#%mlGT@ChNfnS0 akKYVIQ|dg))Fj' );
define( 'NONCE_KEY',        'TWMlK;kmQk2P&}1-KLQD8Y4~&x80F]^p=YPJ8[~Vp^KEk2X0V)?$3sRP.;&BlL^A' );
define( 'AUTH_SALT',        'DleIC)60D,86g$hk)rC[Ba3NMk*jqE2x+DO0X`k@xDD2AzVW|C-:e-PI=FD}ipAO' );
define( 'SECURE_AUTH_SALT', ',@x)/)TZ8;.KEx+r?5o0DZKwU,o~UhWQcUFu||d>uT.$F1(s%/io#a%*W4?_sw^D' );
define( 'LOGGED_IN_SALT',   '4*YJHAc5K+OP$Hla]4Dm:TV`BIZ84RY]R8s<lV[Ss{*s%i3}e)3<~(jz~bU1%&C|' );
define( 'NONCE_SALT',       '!t+ymEEi,W`=GkZruxNyv1={H_KRoy-4}M5T}H|(Q=R!zo7*sU:eUi^iJC`4q5Jb' );

/**#@-*/

/**
 * WordPress Database Table prefix.
 *
 * You can have multiple installations in one database if you give each
 * a unique prefix. Only numbers, letters, and underscores please!
 */
$table_prefix = 'wp_';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 *
 * For information on other constants that can be used for debugging,
 * visit the Codex.
 *
 * @link https://codex.wordpress.org/Debugging_in_WordPress
 */
define( 'WP_DEBUG', false );

/* That's all, stop editing! Happy publishing. */

/** Absolute path to the WordPress directory. */
if ( ! defined( 'ABSPATH' ) ) {
	define( 'ABSPATH', dirname( __FILE__ ) . '/' );
}

/** Sets up WordPress vars and included files. */
require_once( ABSPATH . 'wp-settings.php' );
